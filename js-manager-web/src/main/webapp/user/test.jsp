<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="../bootstrap_zy/treetable/jquery.treetable.css" />	
	<script src="../bootstrap_zy/treetable/jquery.js"></script>
    <script src="../bootstrap_zy/treetable/jquery-ui.js"></script>
    <script src="../bootstrap_zy/treetable/jquery.treetable.js"></script>
    <link href="../js/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <link href="../css/bootstrap-timepicker.min.css" rel="stylesheet" />  
 </head>
<body>
<script type="text/javascript">     

function test(){
	
	$.post("${pageContext.request.contextPath}/corpfp/addcorpfp",
	        {
			taskid:48,
			allotid:93,
			companyconfig:'[{"corpid":"61","groupid":"43"},{"corpid":"62","groupid":"46,59"},{"corpid":"63","groupid":"46,42,59"}]',
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].msg)
            	}  
	        });
}

function test2(){
	$.post("${pageContext.request.contextPath}/corpmemo/corpsign.do",
	        {
		op:'find',
		taskid :48,
		userid:'20170718-18' ,
		signid:1
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

//企业联系人 测试
function test3(){
	$.post("${pageContext.request.contextPath}/allcorp/findcorpcontent.do",
	        {
			corpname:'德州恒丰集团'
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

//获取小组 下层组  信息 
function test4(){
	$.post("${pageContext.request.contextPath}/corpmemo/groupmemoinfo.do",
	        {
			taskid:48,
			userid:'20170718-16'
			
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

function test5(){
	$.post("${pageContext.request.contextPath}/corpmemo/groupmaninfo.do",
	        {
			taskid:48,
			groupid:42
			
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}
function test6(){
	$.post("${pageContext.request.contextPath}/corpmemo/addtaskmemo.do",
	        {
		   /*  op:"update",
		    corpmemoid:339,
			taskid:55,
			corpid:1,
			createtime:'2017-11-18 14:32:05',
			contentinfoid:null,
			contentmemo:'w2222ww',
			linkname:'ww222w',
			linkphone:'11111111',	
			topgroupid:42,
			tgcontentid:100,
			groupid:43,
			glid:'40$42$43',
			userinfo:'[{"userinfoid":"316","userid":"20170718-1","realname":"管理员"}]',
			spokenid:null, */
			

			taskid:55,
			corpid:20,
			createtime:'2017-11-18 18:34:10',
			contentinfoid:'96,97,98',
			contentmemo:'喂喂喂1111',
			linkname:'林姗',
			linkphone:'18650972503',	
			topgroupid:63,
			tgcontentid:90,
			groupid:66,
			glid:'62$63$66',
			userinfo:'[{"userinfoid":"325","userid":"20170718-18","realname":"马福斌"}]',
			spokenid:null, 
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}





	
	function test77(){
	$.post("http://jadmin.chinayarn.com/jsweb/taskuser/taskinfo.do",
	        {
			userinfo:'[{"userinfoid":"316","userid":"20170718-22","realname":"管理员"}]'
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
		}
	
	

	
function test7(){
	$.post("${pageContext.request.contextPath}/taskuser/mytaskfpcorp.do",
	        {
			area:'浙江省',
			ShowType:'Status = 2',
			Datesource:1,
			userinfo:'[{"userinfoid":"316","userid":"20170718-1","realname":"管理员"}]'
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}



function test10(){
	$.post("${pageContext.request.contextPath}/allcorp/findcorpcontent.do",
	        {
			corpname:'杭州中汇棉纺织有限公司',
	
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}




function test8(){
	$.post("${pageContext.request.contextPath}/s_corplist/upcorpMssql.do",
	        {
		Corpid:1,
		oldcorpname:'杭州中汇棉纺织有限公司',
		CorpName:'中汇',
		Address:null,
		CorpCateWu:null,
		ProdMain:null,
		Memo:null,
		CorpFax:null,
		CorpPhone:null
	
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

//修改企业联系人
function test9(){
	$.post("${pageContext.request.contextPath}/s_corplist/upcorplxrMssql.do",
	        {
		Corpid:1,
		linkman:'李文睿',
		jobcate:'不知道',
		phone:null,
		mobile:null,
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}


//修改企业联系人
function test9(){
	$.post("${pageContext.request.contextPath}/s_corplist/upcorplxrMssql.do",
	        {
		Corpid:1,
		linkman:'李文睿',
		jobcate:'不知道',
		phone:null,
		mobile:null,
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

//修改企业联系人
function test15(){
	$.post("${pageContext.request.contextPath}/taskuser/taskusercorp.do",
	        {
		page:1,
		rows:10,
		taskid:55,
		contentid:95,
		userinfo:'[{"userinfoid":"316","userid":"20170718-18","realname":"管理员"}]',
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}



function test18(){
	$.post("${pageContext.request.contextPath}/gettype/corptype.do",
	        {
		type:'corpcate',
		
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}
//添加预约       
function test28(){
	$.post("${pageContext.request.contextPath}/corpsign/bespokenAdd.do",
	        {
		taskid:55,
		corpid:1,
		spokenlinkmanid:55,
		spokenlinkmen:'测试',
		spokenlinkphone:'232323232323232',
		spokentime:'2017-08-24 13:41:01',
		spokencontent:'早点见面',
		spokencompany:'这是公司吗？',
		userinfo:'[{"userinfoid":"316","userid":"20170718-22","realname":"管理员"}]',
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

//添加关注       
function test299(){
	$.post("${pageContext.request.contextPath}/follow/corp.do",
	        {
		op:'insert',
		taskid:55,
		corpid:1,
		followlinkmanid:55,
		followlinkmen:'测试',
		followlinkphone:'232323232323232',
		followcontent:'早点见面',
		followcompany:'yes',
		
		userinfo:'[{"userinfoid":"316","userid":"20170718-22","realname":"管理员"}]',
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

//获取预约    信息  
function test29(){
	$.post("http://jadmin.chinayarn.com/jsweb/corpsign/bespokeninfo.do",
	        {
		userinfo:'[{"userinfoid":"316","userid":"20170718-22","realname":"管理员"}]',
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}


//获取预约    信息  
function test30(){
	$.post("${pageContext.request.contextPath}/s_corplist/Seachlist.do",
	        {
			page:5,
			rows:10
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
          	if(obj[0].code == 1){
	                 alert(obj[0].data)
          	} 
	        });
}
//查询 公司 信息 分页 条件
function test33(){
	$.post("${pageContext.request.contextPath}/taskuser/taskusercorp.do",
	        {
		taskid:
			63,
			corpname:null,
			corpcate:null,
			lookorder:null,
			sxwlinkname:null,
			ShowType:null,
			memostate:null,
			page:
			1,
			contentid:null,
			Datesource:
			1,
			isdczjhy:
			0,
			oldmemoinfo:null,
			rows:
			50,
			userinfo:
			'[{"userinfoid":"325","userid":"20170718-24","realname":"戢琴琴"}]'
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
          	if(obj[0].code == 1){
	                 alert(obj[0].data)
          		} 
	        });
}


//查询 公司 信息 分页 条件
function test34(){
	$.post("${pageContext.request.contextPath}/taskuser/allusercorp.do",
	        {
			lookorder:
			'LogInDate',
			desc:'desc',
			page:1,
			rows:50,
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
          	if(obj[0].code == 1){
	                 alert(obj[0].data)
          		} 
	        });
}


function test36(){
	$.post("${pageContext.request.contextPath}/follow/corp.do",
	        {
		op:'select',
		userinfo:'[{"userinfoid":"316","userid":"20170718-18","realname":"管理员"}]'
	        })
	        
	 }
	  


function test38(){
	$.post("${pageContext.request.contextPath}/corpsign/despoken.do",
	        {
		spokenid:1},
		function (data) {
        	var obj = JSON.parse(data);
      	if(obj[0].code == 1){
                 alert(obj[0].data)
      		} 
        });
	 }
	

function test78(){
	$.post("http://jadmin.chinayarn.com/jsweb/taskuser/findtaskgroup.do",
	        {
		taskid:55,
		userinfo:'[{"userinfoid":"316","userid":"20170718-22","realname":"管理员"}]'
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

function test79(){
$.post("${pageContext.request.contextPath}/corpmemo/findmemotime",
        {
		taskid:55,
		starttime:'2017-11-18 13:41:01',
		endtime:'2017-12-24 13:41:01',
		userinfo:'[{"userinfoid":"316","userid":"20170718-18","realname":"管理员"}]'
        },
         function (data) {
        	var obj = JSON.parse(data);
        	if(obj[0].code == 1){
                 alert(obj[0].msg)
        	}  
        });
}

function test99(){
	$.post("${pageContext.request.contextPath}/corpmemo/memoselect.do",
	        {
			 taskid:57,
			 
			 memostate:5,
			 userinfo:'[{"userinfoid":"316","userid":"20170718-18","realname":"管理员"}]'
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
	        	if(obj[0].code == 1){
	                 alert(obj[0].msg)
	        	}  
	        });
	}

function test199(){
	$.post("${pageContext.request.contextPath}/corpmemo/memocorpinfo.do",
	        {
			 corpid:1,
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
	        	if(obj[0].code == 1){
	                 alert(obj[0].msg)
	        	}  
	        });
	}
function test399(){
	$.post("${pageContext.request.contextPath}/corpsign/bespokeninfo.do",
	        {
			starttime:'2017-11-18 13:41:01',
			endtime:'2017-12-24 13:41:01',
			userinfo:'[{"userinfoid":"316","userid":"20170718-18","realname":"管理员"}]'
			        },
	         function (data) {
	        	var obj = JSON.parse(data);
	        	if(obj[0].code == 1){
	                 alert(obj[0].msg)
	        	}  
	        });
	}


function test499(){
	$.post("${pageContext.request.contextPath}/corpsign/bespokeninfo.do",
	        {
		starttime:'2017-11-23 11:47:27',
		endtime:'2017-11-30 00:00:00',
			userinfo:'[{"userinfoid":"332","userid":"20170718-24","realname":"戢琴琴"}]'
			        },
	         function (data) {
	        	var obj = JSON.parse(data);
	        	if(obj[0].code == 1){
	                 alert(obj[0].msg)
	        	}  
	        });
	}




window.onload = function () {
	test34();
   } 
   
function test78(){
	$.post("${pageContext.request.contextPath}/corpsign/bespokenAdd.do",
	        {
		corpid:
			28,
			taskid:
			55,
			spokenlinkmanid:
			0,
			spokenlinkmen:
			'四川省宜宾惠美线业有限责任公司',
			spokenlinkphone:
			0831-2400428,
			spokentime:
			'2018-02-28 17:14:30',
			spokencontent:
			'的是非得失',
			spokencompany:
			'四川省宜宾惠美线业有限责任公司',
			isdefault:
			1,
			userinfo:
			'[{"userinfoid":"325","userid":"20170718-18","realname":"马福斌"}]'
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}
   
   
   
   
function test6(){
	$.post("${pageContext.request.contextPath}/corpmemo/addtaskmemo.do",
	        {
		   /*  op:"update",
		    corpmemoid:339,
			taskid:55,
			corpid:1,
			createtime:'2017-11-18 14:32:05',
			contentinfoid:null,
			contentmemo:'w2222ww',
			linkname:'ww222w',
			linkphone:'11111111',	
			topgroupid:42,
			tgcontentid:100,
			groupid:43,
			glid:'40$42$43',
			userinfo:'[{"userinfoid":"316","userid":"20170718-1","realname":"管理员"}]',
			spokenid:null, */
			taskid:55,
			corpid:1,
			linkmanid:15,
			createtime:'2017-11-18 18:34:10',
			contentinfoid:'97,99,98,100',
			contentmemo:'测试测2222222试啊',
			linkname:'林姗',
			linkphone:'18650972503',	
			topgroupid:63,
			tgcontentid:'97',
			groupid:66,
			glid:'62$63$66',
			userinfo:'[{"userinfoid":"325","userid":"20170718-18","realname":"马福斌"}]',
			spokenid:null, 
	        },
	         function (data) {
	        	var obj = JSON.parse(data);
            	if(obj[0].code == 1){
	                 alert(obj[0].data)
            	} 
	        });
}

	</script>
</body>

</html>