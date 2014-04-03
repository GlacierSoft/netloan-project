/**
 * 渲染字段信息
 */
function renderGridValue(value,fields){
	for(var i =0;i<fields.length;i++){
		if(value == fields[i].value){
			return fields[i].label;
		}
	}
}