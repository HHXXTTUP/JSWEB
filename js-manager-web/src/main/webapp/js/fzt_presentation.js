//实例化编辑器
//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
var ue1 = UE.getEditor('group');
var ue2 = UE.getEditor('service');
var ue3 = UE.getEditor('serviceitems');
$(document).ready(function(){
	var id
	var init = function(){
		$.ajax({
			url: 'http://sdk.chinayarn.com:83/fzdxt/fzapp/admin/FZT.ashx',
			type: 'POST',
			dataType: 'text',
			data: {
				op: 'GetFZTInfo'
			},
			success:function(res){
				var res = eval('('+ res +')')
				if(res.code == '1'){
					ue1.ready(function(){
						ue1.setContent(res.data.Group)
					});
					ue2.ready(function(){
						ue2.setContent(res.data.Service)
					});
					ue3.ready(function(){
						ue3.setContent(res.data.ServiceItems)
					});
					// console.log(res.data)
					id = res.data.ID
				}
			}
		})
	};
	init();
	// console.log(id)	
	$('#submit').click(function(event){
		event.preventDefault(); // 兼容标准浏览器
	    window.event.returnValue = false;
	    // setTimeout(function(){
		    var submitdata = '{'+
				'"group"'+":"+'"'+UE.getEditor('group').getContent()+'"'+','+
				'"service"'+":"+'"'+UE.getEditor('service').getContent()+'"'+','+
				'"serviceitems"'+":"+'"'+UE.getEditor('serviceitems').getContent()+'"'+','+
				'"id"'+":"+'"'+id+'"'+
				'}'
			// submitdata = JSON.stringify(submitdata)
			// submitdata = eval('('+ submitdata +')')
			// submitdata = JSON.parse(submitdata)
			console.log(submitdata)
			$.ajax({
				url: 'http://sdk.chinayarn.com:83/fzdxt/fzapp/admin/FZT.ashx',
				type: 'POST',
				data: {
					op: 'ModifyFZTInfo',
					handle:'edit',
					jsonstr:submitdata
				},
				success:function(res){
					var res = eval('('+ res +')')
					if(res.code == '1'){
						console.log(res)
						// toastr.options = {  
					 //        closeButton: true,  
					 //        debug: false,  
					 //        progressBar: true,  
					 //        positionClass: "toast-bottom-center",  
					 //        onclick: null,
					 //        showDuration: "300",  
					 //        hideDuration: "1000",  
					 //        timeOut: "2000",  
					 //        extendedTimeOut: "1000",  
					 //        showEasing: "swing",  
					 //        hideEasing: "linear",  
					 //        showMethod: "fadeIn",  
					 //        hideMethod: "fadeOut"  
					 //    };
						toastr.success('修改成功')
					}else{
						toastr.success('修改出错')
					}
				}
			})
		// },10)
	})
})
