/**
 * 增加数组判断是否包含某元素功能
 * 
 * @param true/false
 */
Array.prototype.contains = function(obj) { 
	var i = this.length;
	while (i--) { 
		if (this[i] == obj) { 
			return true; 
		} 
	} 
	return false; 
} 

/**
 * 更换主题方法，在系统中link引入easyui的主题，必须加上id为easyuiThemeName
 * @param themeName 主题的名称，和theme中文件夹名称对应
 */
function changeThemeFun(themeName) {
	//定义了一个link的id为easyuiTheme，支持主题更换
	var $easyuiTheme = $('#easyuiTheme');
	var url = $easyuiTheme.attr('href');
	var href = url.substring(0, url.indexOf('jquery-easyui-theme')) + 'jquery-easyui-theme/' + themeName + '/easyui.css';
	//动态更换引用主题
	$easyuiTheme.attr('href', href);
	//遍历页面所有的iframe，子页面的主题也进行动态更换
	var $iframe = $('iframe');
	if ($iframe.length > 0) {
		for ( var i = 0; i < $iframe.length; i++) {
			var ifr = $iframe[i];
			try {
				$(ifr).contents().find('#easyuiTheme').attr('href', href);
			} catch (e) {
				try {
					ifr.contentWindow.document.getElementById('easyuiTheme').href = href;
				} catch (e) {
				}
			}
		}
	}
	$.cookie('easyuiThemeName', themeName, {
		expires : 7
	});

};

/**
 * 扩展propertygrid，增加getGroups方法
 * 返回一组combobox的groups的数组
 */
$.extend($.fn.propertygrid.methods, {
	    getGroups: function (jq) {
	    	var groups = [];
	    	var returnStr = '[';
	    	var opt= $(jq).propertygrid('options');
	    	var rows = $(jq).propertygrid("getRows");
	    	$.each(rows, function(i, n){
	    		var group = n[opt.groupField];
	    		if(!groups.contains(group)){
	    			groups.push(group);
	    			var groupName = group.split(":")[0];
	    			returnStr += '{"id":"'+group+'","text":"'+groupName+'"},';
	    		}
	    	});
	    	returnStr = returnStr.substr(0, returnStr.length-1) + ']';
	    	return $.parseJSON(returnStr);
	    }
});

function action_controller(param,datagird){
	return {
			select : function(){
				$.each(param.actions, function(){
					if('single' === this.controlType){
						$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('enable');
					}
				});
			},
			unSelect : function(){
				$.each(param.actions, function(){
					if('single' === this.controlType){
						$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('disable');
					}
				});
			},
			check : function(){
				var rows = $(datagird).datagrid("getChecked");
				if(rows.length > 0){
					$.each(param.actions, function(){
						if('multiple' === this.controlType){
							$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('enable');
						}
					});
					
				}
			},
			unCheck : function(){
				var rows = $(datagird).datagrid("getChecked");
				if(rows.length > 0){
					$.each(param.actions, function(){
						if('multiple' === this.controlType){
							$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('enable');
						}
					});
				}else{
					$.each(param.actions, function(){
						if('multiple' === this.controlType){
							$('#'+param.toolbarId+'').find("a[id$='"+this.flag+"']").linkbutton('disable');
						}
					});
				}
			}
	};
};