<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%    
String path = request.getContextPath();    
// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
// 将 "项目路径basePath" 放入pageContext中，待以后用EL表达式读出。    
pageContext.setAttribute("basePath",basePath);    
%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<jsp:include page="../../inc.jsp"/>  
  
</head>
<body>     
<div style="float: left;width: 800px;height:500px;"> 
   <div style="float: left;width:width:138px ">
      <div id="cc" class="easyui-layout" style="width:138px;height:500px;">     
      <!-- 左边布局 --> 
	 <div data-options="region:'west',title:'我的消息'" style="width:138px;border-right-style: none;">
	    <div>
		     <ul id="ulOne" class="easyui-tree"> 
	           <li iconCls="icon-standard-email-edit">写信息</li>
	           <li iconCls="icon-standard-email-open">收件箱</li>
	           <li iconCls="icon-standard-email-go">发件箱</li>
	         </ul>   
         </div>
	     <div style="padding-top: 120px;width: 100%">  
				<div id="myContacts" class="easyui-panel" title="我的联系人"    
				        style="width:137px;height:260px; background:#fafafa;border-bottom-style: none;border-left-style:none;border-right-style:none; OVERFLOW-Y: auto; OVERFLOW-X:hidden; "> 
			         <ul id="ulTwo"  class="easyui-tree" style="position: absolute;width: 100%">
					     <c:forEach items="${userList}" var="us" >
				      	 <li id="${us.userId}" iconCls="icon-cologne-user">${us.userCnName}</li>
			      	     </c:forEach> 
			        </ul>  
				</div> 
          </div> 
	   </div>   
     </div>
   </div> 
	  <!-- 中间布局 --> 
  <div data-options="region:'center'" style="height: 498px;float: left;border-style:solid;border-color:#C3C3C3; border-width:0.5px;" >  
	         <!-- 收件箱和发件箱的div层 -->
		     <div id="tt" class="easyui-tabs" style="width:648px;height:498px;"> 
		     
		         <!--  收件箱 -->
		          <div title="已接收消息  "  id="tab1"   style="overflow:auto;padding:0px;">    
		             <table id="receiveMessageDataGrid"></table>   
			      </div>    
			       
			      <!--发件箱 -->
			      <div title=" 已发送消息 " style="overflow:auto;padding:0px;">    
	 	             <table id="messageDataGrid"></table>   
			      </div>   
	         </div>    
	         
	        <!--  写短信的div层 class="easyui-tree" -->
	         <div id="write" style="float: left;">  
	         <div id="myContacts" class="easyui-panel" title="写信息"    
				        style="width:656px; background:#fafafa;border-style: none;"> 
			  </div> 
		         <div id="ccs" style="width:656px;height:467px;border-left-style: none;float: left;">    
		               <div data-options="region:'center',title:'写短信'" style="height: 100%;float: left;border-left-style: none;border-right-style: none;" >
			               <div style="width: 515px;height: 100%;float: left;margin-left: 13px; ">
				                <div id="info" style="margin-bottom: 20px;margin-top:30px;border-style:solid;border-color:#C3C3C3;
				                   border-width:0.5px; width: 100%;height: 150px;OVERFLOW-Y: auto; OVERFLOW-X:hidden; scrollbar-shadow-color: #ffffff; scrollbar-highlight-color: #ffffff; scrollbar-face-color: #d9d9d9; scrollbar-3dlight-color: #d9d9d9; scrollbar-darkshadow-color: #d9d9d9; scrollbar-track-color: #ffffff; scrollbar-arrow-color: #ffffff"  >
				                </div>  
				                <div> 
				                   <!--  kindeditor编辑器 -->
					                 <textarea id="kindeditorMessage"  autofocus style="width:100%;height: 150px"  ></textarea> 
								    <input style="margin-top: 5px;margin-left: 480px;width: 37px;height: 25px" type="button" onclick="sendMsg()" value="发送">
				                </div>  
				          </div> 
				          <div style="width:115px;height: 100%;float: left;margin-left: 11px;OVERFLOW-Y: auto; OVERFLOW-X:hidden; float: le">
					               <div class="easyui-panel" style="width:115px;height:437px;margin-top:30px; float: left; text-align: center;border-bottom-style: none;">
						                <a class="l-btn" href="javascript:empt()" style="width: 28px;text-align: center;margin-top: 3px">
									            <span class="l-btn-text" style="font-size: 1;text-align: center;">&nbsp;移除</span>
									     </a> 
					                    <a class="l-btn" href="javascript:emptyAll()" style="width: 28px">
									            <span class="l-btn-text" style="font-size: 1;text-align: center;margin-right: 0">&nbsp;清空</span>
									    </a> 
									    <hr>
									    <ul id="tta" class="easyui-tree"  > 
					                    <li iconCls="icon-hamburg-customers">
						                      <span>收件人组</span> 
						                       <ul>  </ul>
										 </li>  
								   </ul> 
				                   </div> 
			                 </div>   
		               </div>   
	             </div>   
	       </div> 
	  </div>   
	</div> 
	   
	
	<script type="text/javascript">   
	var editor1;
	 //初始化禁用我的联系人
	 var divOTwo="<div id='opacityTwo' style='position: absolute;width: 100%;height: 100%;background-color: gray;filter:alpha(Opacity=20); opacity: 0.2;z-index: 999;'></div>";
	
	 $(function(){   
		 
	    //加载收件箱和发件箱
	    inbox("all");//默认加载收件箱，不区分已读和未读
	    sendBox(); 
	    $("#myContacts").append(divOTwo);  
	    
		//点击左边收件箱或者发件箱，进行切换显示，控制页面的切换
		$("#ulOne").tree({
			onClick: function(node){
				var fun=node.text;
				if(fun=="写信息"){
					 glacier.system_mgr.message.writeMsg();
				}else if(fun=="收件箱"){  
					 glacier.system_mgr.message.receiveMsg();
					 $("#opacityTwo").remove();
					 $("#myContacts").append(divOTwo); 
				}else{ 
					 glacier.system_mgr.message.sendMsg();
					 $("#opacityTwo").remove();
					 $("#myContacts").append(divOTwo);
				 } 
			}
		 });
		
		//点击我的联系人，添加到联系人组
		$("#ulTwo").tree({
			onClick: function(node){   
				var selected = $('#tta').tree('getRoot');  
				var str=$("#ulTwo").tree("pop",node.target);  
				$('#tta').tree('append', {
					parent: selected.target,
					data: str
				});   
			}
		});   
	});
	
	//------------------以下为脚本方法，上面为jquery----------------------//
	
	$.util.namespace('glacier.system_mgr.message');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//移除右边收件人
	function empt(){  
		  var node = $('#tta').tree('getSelected');
          if (node==null||node.text=="收件人组") {
              alert("未选中收件人");
          }
          else { 
        	  var str=$("#tta").tree("pop",node.target);  
        	  $('#ulTwo').tree('append', { 
					data: str
				});  
          } 
	}
	
	//清空收件人列表
    var emptyAll = function emptall(){  
		  var node = $('#tta').tree('getChildren');  
		   if (node.length<2) {
               //alert("收件人列表为空！");
             } else {   
            	 var i=1 
            	 while(i<=(node.length-1)){ 
            		 var str=$("#tta").tree("pop",node[i].target);  
            		 $('#ulTwo').tree('append', { 
     					data: str
     				 });  
            	  i++; 
              } 
        }   
	} 
	
    //默认让写信息的面板隐藏
	 $("#write").hide(); 
    
	 //收件箱，tab面板加载收件箱的内容
	glacier.system_mgr.message.receiveMsg = function receiveMessage(){  
		 $("#write").hide();
		 $("#tt").show(); 
		 $('#tt').tabs('select',0);  
		 inbox("all"); 
		 //清空收件人列表
		 emptyAll();  
	 }
	 
	 //发件箱，tab面板加载收件箱的内容
	glacier.system_mgr.message.sendMsg = function sendMessage(){   
		 $("#write").hide();
		 $("#tt").show(); 
		 $('#tt').tabs('select',1);   
		 $("#messageDataGrid").datagrid('reload'); 
		 //清空收件人列表
		 emptyAll();
	 }
	  
	 //写信息，tab面板加载写信息的内容
	 glacier.system_mgr.message.writeMsg = function writeInfo(){
		 
		 
		 $("#tt").hide(); 
		 $("#write").show();
		 //清空显示列表
		 $("#info").empty();
		 $("#kindeditor").val(" ");
		 $("#opacityTwo").remove();
		 //清空收件人列表
		 emptyAll();
	 }  
	
	//发送消息
    function sendMsg(){ 
			 //获取编辑器的内容
		     var str=	$("#kindeditorMessage").val(); 
			 if(typeof(str) == "undefined"||str == ""){
				 $.messager.show({//后台验证弹出错误提示信息框
						title:'错误提示',
						width:400,
					    height:120,
					    icon:'error',
						msg: "<span style='color:red'>消息内容不能为空</span>",
						timeout:2000
					});
				 return;
			 }
			//获取接收人id
	         var nodes  =$('#tta').tree('getChildren');
			 if(nodes.length<2){
				 $.messager.show({//后台验证弹出错误提示信息框
						title:'错误提示',
						width:400,
					    height:120,
					    icon:'error',
						msg: "<span style='color:red'>请先选择收件人</span>",
						timeout:2000
					});
				 return;
			 }
			 
			 $.messager.progress();  
	         var arr = new Array();
	         var index=0;
	         for(var i=0,n=nodes.length;i<n;i++){  
	        	 if (typeof(nodes[i].id) == "undefined") {  
	        		 continue ; 
	        		}  
	        	   //收件人的数组id  
	        	   arr[index]=nodes[i].id;   
	        	   index++; 
	         } 
			 $.ajax({
					   type: "POST",
					   url: ctx + '/do/message/addSave.json',
					   data:"recipientIds="+arr+"&content="+str,
					   dataType:'json',
					   success: function(r){ 
						   if(r.success){
							   $.messager.show({
									title:'成功提示',
									msg:r.msg,
									width:400,
								    height:120,
									timeout:3000,
									showType:'slide'
								});   
							   $("#info").append("<span style='color: blue;'>&nbsp;&nbsp;我说 :"+r.obj.sendtime+" </span><br>&nbsp;&nbsp;&nbsp;&nbsp;"+str+"<br>");
							   //清空下面的编辑器内容 
							   editor1.html(' ');
						   }else{
							   $.messager.show({//后台验证弹出错误提示信息框
									title:'错误提示',
									width:400,
								    height:120,
								    icon:'error',
									msg: r.msg,
									timeout:4500
								});
						   } 
						   $.messager.progress('close');
					   }
				});  
	  }
	
	
	//--------------------绑定编辑器-----------------------
	
	KindEditor.options.filterMode = false;
	KindEditor.ready(function(K) {
		editor1=K.create('#kindeditorMessage', {
			themeType : 'qq',
			allowFileManager : true,
			minWidth : "600px", 
			uploadJson : '../resources/js/kindeditor/jsp/upload_json.jsp',
            fileManagerJson : '../resources/js/kindeditor/jsp/file_manager_json.jsp',
            allowFileManager : true,
            urlType:'domain', 
			afterBlur : function() {
				this.sync(); 
			},
			items : [
				'bold','italic','underline','fontname','fontsize','forecolor','hilitecolor','plug-align','plug-order','plug-indent','link','code','emoticons','flash','table','lineheight','fullscreen','image'
			]
		});
	});  
	   
	//****************消息dataGrid************************
	 
	//发件箱dateGrid
	function sendBox(){
          $('#messageDataGrid').datagrid({    
			   // fit : true,//控件自动resize占满窗口大小
			    height:460,  
			    width:645,
			    url:ctx + '/do/message/all.json?sendOrReceive=send', 
			   //  fitColumns:true,//自动填充行
				nowrap: true,//禁止单元格中的文字自动换行
				autoRowHeight: false,//禁止设置自动行高以适应内容
				striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
				singleSelect:false,//限制单选 
				selectOnCheck:false,//选择的时候复选框打勾
				sortName: 'sendTime',//排序字段名称
				sortOrder: 'desc',//升序还是降序
				sortable:true,
				remoteSort: true,//开启远程排序，默认为false 
			    columns:[[    
			        {field:'messageId', title:'ID', checkbox:true },
			        {field:'receivers',title:'接收人',width:180,sortable:true},    
			        {field:'content',title:'内容',width:220,sortable:true},    
			        {field:'sendTime',title:'发送时间',width:180,sortable:true}    
			    ]],
			    pagination : true,//True 就会在 datagrid 的底部显示分页栏
				rownumbers:true,//True 就会显示行号的列  	 
				onLoadSuccess:function(index, record){//加载数据成功触发事件 
					$(this).datagrid('clearSelections');
					$(this).datagrid('clearChecked');
					var rows=$(this).datagrid("getRows");
					if(rows.length==0){   
						var body = $(this).data().datagrid.dc.body2;
						body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
					}
				},
				onDblClickRow:function(rowIndex, rowData){
					selectInfo(rowData,rowData.messageId,"send");
				}
			});   
	  
	}
	 //创建工具栏，绑定到发件箱
	 $('#messageDataGrid').datagrid({
			toolbar: [{
				iconCls: 'icon-standard-comments-delete',
				text:"删除",
				 handler: function(){ 
					 var rows = $("#messageDataGrid").datagrid("getChecked"); 
					 deleteDate(rows,"send");
				}  
			}]
		}); 

	 
	 //收件箱dateGrid
	function inbox(status){ 
		$('#receiveMessageDataGrid').datagrid({    
		    // fit : true,//控件自动resize占满窗口大小
		    height:460,  
		    width:645,  
		    url:ctx + '/do/message/all.json?sendOrReceive=receive&readStatus='+status, 
		    //  fitColumns:true,//自动填充行
			nowrap: true,//禁止单元格中的文字自动换行
			autoRowHeight: false,//禁止设置自动行高以适应内容
			striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
			singleSelect:false,//限制单选 
			selectOnCheck:false,//选择的时候复选框打勾
			sortName: 'sendTime',//排序字段名称
			sortOrder: 'DESC',//升序还是降序 
			sortable:true,
			remoteSort: false,//开启远程排序，默认为false 
		    columns:[[    
		        {field:'messageId', title:'ID', checkbox:true }, 
		        {field:'senderName',title:'发送人',width:90,sortable:true},    
		        {field:'content',title:'内容',width:220,sortable:true},    
		        {field:'sendTime',title:'发送时间',width:180,sortable:true},   
		        {   field:'readStatus',
		        	title:'信件状态',
		        	sortable:true,
		        	width:90,
		        	formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					 if(value==false){
						 value="未读";
					 }else{ 
						 value="已读"; 
					 } 
		        		return value;
				}}
		    ]],
		    pagination : true,//True 就会在 datagrid 的底部显示分页栏
			pannouncementSize : 10,//注意，pannouncementSize必须在pannouncementList存在
			pannouncementList : [2,10,50,100],//从session中获取
			rownumbers:true,//True 就会显示行号的列
			onLoadSuccess:function(index, record){//加载数据成功触发事件  
				$(this).datagrid('clearSelections');
				$(this).datagrid('clearChecked');
				var rows=$(this).datagrid("getRows");
				if(rows.length==0){   
					var body = $(this).data().datagrid.dc.body2;
					body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
				}
			},
			onDblClickRow:function(rowIndex, rowData){ 
				selectInfo(rowData,rowData.messageId,"receive");
			} 
		});  
	} 
	 
	 //创建工具栏，绑定到发件箱
	 $('#receiveMessageDataGrid').datagrid({
			toolbar: [{
				iconCls: 'icon-standard-comment',
				text:"未读信息",
				 handler: function(){ 
					 inbox('false');
				}
			  },'-', 
				{ 
					iconCls:'icon-standard-comments',
					text:'已读信息',
					handler: function(){ 
						inbox('true');
					} 
				},'-', 
				{ 
					iconCls:'icon-standard-comments-delete', 
					text:'删除信息',
					handler: function(){ 
						 var rows = $("#receiveMessageDataGrid").datagrid("getChecked"); 
						 deleteDate(rows,"receive"); 
					}
				}]
		});  
	  

	 //查看消息
	 function selectInfo(rowData,messgaId,sendOrReceive){ 
			//初始化页面
			$("#kindeditorMessage").text(" ");
			 glacier.system_mgr.message.writeMsg(); 
			 $("#info").empty();
			//alert(rowData.messageId);
			//加载该消息，同时更新该消息的读取状态
		 	$.ajax({
			   type: "POST",
			   url: ctx + '/do/message/myMsg.json?messageId='+messgaId+'&sendOrReceive='+sendOrReceive,
			   dataType:'json',
			   success: function(r){   
				    var selected = $('#tta').tree('getRoot');  
				    var nodes=$('#ulTwo').tree('getChildren');//获取所有的子节点 
				   //查看的是发送的消息，接收人列表可能有多个
				   if(sendOrReceive=="send"){
					   $.each(r.obj,function(i,v){
							$('#tta').tree('append', { 
								parent: selected.target,
								data:[{ 
									"iconCls":"icon-cologne-user",
									"id":v.recipient, 
									"text": v.recipientName  
								}]
							});  
							//刷新左边的联系人列表
							$.each(nodes,function(index,value){
								if(value.text==v.recipientName){
									$('#ulTwo').tree('remove',nodes[index].target); 
								}
							});    
						});  
					   $("#info").append("<span style='color: blue;'>&nbsp;&nbsp;我说:"+r.obj[0].receiveSendtime+" </span><br>&nbsp;&nbsp;&nbsp;&nbsp;"+rowData.content+"<br>");
					      
				   }else{  //查看的是接收的消息
						$('#tta').tree('append', { 
							parent: selected.target,
							data:[{ 
								"iconCls":"icon-cologne-user",
								"id":r.obj.sender, 
								"text": r.obj.senderName  
							}]
						});    
				   
						 $("#info").append("<span style='color: blue;'>&nbsp;&nbsp;"+r.obj.senderName+":"+r.obj.sendtime+" </span><br>&nbsp;&nbsp;&nbsp;&nbsp;"+r.obj.content+"<br>");
						 //刷新联系人列表
						var nodes=$('#ulTwo').tree('getChildren');//获取所有的子节点 
						$.each(nodes,function(i,v){
							if(v.text==r.obj.senderName){
								$('#ulTwo').tree('remove',nodes[i].target);
								return;
							}
						}); 
				   }  
			    }
		    });   
	 } 
	  
	 //删除消息
	 function deleteDate(rows, receive){ 
		 if(rows.length<1){
			 $.messager.show({//后台验证弹出错误提示信息框
					title:'错误提示',
					width:380,
					icon:'error',
					height:120,
					msg: '<span style="color:red">未选择删除的信件<span>',
					timeout:3000, 

				});
			 return;
		 }
		 
		 $.messager.confirm('确认对话框', '确认删除信件？', function(r){
				if (r){ 
						var messageIds = [];//删除的id标识 
						for(var i=0;i<rows.length;i++){
							messageIds.push(rows[i].messageId);  
						} 
						$.ajax({
							   type: "POST",
							   url: ctx + '/do/message/del.json',
							   data: {messageIds:messageIds.join(','),sendOrReceive:receive},
							   dataType:'json',
							   success: function(r){
								   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
									   $.messager.show({
											title:'提示',
											timeout:3000,
											msg:r.msg
										});
									   $("#messageDataGrid").datagrid('reload');
									   $("#receiveMessageDataGrid").datagrid('reload');
								   }else{
										$.messager.show({//后台验证弹出错误提示信息框
											title:'错误提示',
											width:380,
											icon:'error',
											height:120,
											msg: '<span style="color:red">'+r.msg+'<span>',
											timeout:4500
										});
									}
							   }
						}); 
				 }
			}); 
	 } 
	</script> 
</body>   
</html>