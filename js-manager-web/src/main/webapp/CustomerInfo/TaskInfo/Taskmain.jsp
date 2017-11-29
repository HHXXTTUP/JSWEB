<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>中国精纱网后台首页</title>
<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet" type="text/css" href="../../css/base.css">
<link rel="stylesheet" type="text/css" href="../lib/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="../stylesheets/theme.css">
<link rel="stylesheet" href="../../toastr/toastr.min.css">
<!-- <link rel="stylesheet" type="text/css" href="../stylesheets/premium.css"> -->
<link rel="stylesheet" href="../../css/taskmain.css">
<script src="../lib/jquery-1.11.1.min.js" type="text/javascript"></script>
<!-- <script src="../lib/jQuery-Knob/js/jquery.knob.js" type="text/javascript"></script>
<script type="text/javascript">
  $(function() {
    $(".knob").knob();
  });
</script> -->
<style>
  input[type=checkbox]{transform: scale(1.8);margin-right: 6px;}
</style>
</head>
<body class="theme-blue">
  <div id="app" style="padding: 0;">
    <div class="taskselect">
      <a href="javascript:;" class="resert" @click="resertPreson"><i class="glyphicon glyphicon-repeat"></i>返回个人中心</a>
      <div class="tasklist">
        <a href="javascript:;" v-for="(item,index) in taskList" @click="clickTask(item,index)" :class="{'activeTask':activeTask==index}">
          <b :style="{ width: item.percent + '%' }"></b>
          <b>{{item.taskname}}  完成{{item.percent}}%</b>
        </a>
      </div>
      <div class="companylist" v-if="isshowCompany">
        <i class="glyphicon glyphicon-chevron-down icon"></i>
        <input type="text" class="search" placeholder="输入公司名称查询" @input="searchCompanyName" v-model="searchComapanyName">
        <div style="height: 500px;overflow-y: auto;">
          <a href="javascript:;" class="companybtn" @click="notepage(item)" v-for="item in companyList" data-target="#remarkModal"><span>{{item.CorpName}}</span></a>
        </div>
      </div>
    </div>
    <div class="content"  style="margin-left:0px" v-if="isNotePage">
      <div class="header">
        <div class="stats">
          <p class="stat"><span class="label label-info">{{taskItem.successcorp}}</span> 已完成</p>
          <!-- <p class="stat"><span class="label label-success">27</span>未完成</p>
          <p class="stat"><span class="label label-danger">0</span> 正在更新</p> -->
        </div>
        <h1 class="page-title">工作概览</h1>
        <ul class="breadcrumb">
          <li><a href="./Taskmain.jsp"><i class="glyphicon glyphicon-refresh"></i>刷新</a> </li>
          <li class="active">正常登陆</li>
        </ul>
      </div>
      <hr>
      <div class="remark-content">
        <div class="panel panel-default">
          <a href="#page-stats1" class="panel-heading" data-toggle="collapse" >企业备注审批</a>
          <div id="page-stats1" class="panel-collapse panel-body collapse in">
            <ul class="ultable">
              <li><span>备注公司</span><span>任务</span><span>备注人</span><span>所属部门</span><span>备注总计</span><span>操作</span></li>
            </ul>
            <ul class="ultable ultable_content">
              <li v-for="item in approvalList"><span>{{item.corpname}}</span><span>{{item.taskname}}</span><span>{{item.realname}}</span><span>{{item.groupname}}</span><span>{{item.memocount}}</span><span><a href="javascript:;" class="btn"  data-target="#ApprovalModal" @click="preApprove(item)">审批</a></span></li>
            </ul>
          </div>
        </div>
      </div>
      <hr>
      <div class="preson-content">
        <div class="panel panel-default"> 
          <a href="#page-stats2" class="panel-heading" data-toggle="collapse" >个人完成情况</a> 
          <div id="page-stats2" class="panel-collapse panel-body collapse in">
            <div>
              <p style="float: left;">个人进度情况</p>
              <select name="" id="" class="stats" @change="changePreTime" v-model="preTime" style="width:120px;background-color:rgb(95, 111, 141);color:#fff;height: 34px;border-radius: 6px;">
                <option :value="preTime1">今日</option>
                <option :value="preTime3">三天</option>
                <option :value="preTime7">一周</option>
                <option :value="preTime30">一个月</option>
              </select>
            </div>
            <div style="width: 100%;height: 300px;padding-top: 40px;">
              <ul class="ultable">
                <li><span>公司</span><span>任务</span><span>时间</span><span>备注意向</span><span>备注内容</span><span>是否审批通过</span></li><!-- <span>操作</span> -->
              </ul> 
              <ul style="overflow-y: auto;height: 85%;">
                <li v-for="item in preWorkList"><span>{{item.corpname}}</span><span>{{item.taskname}}</span><span>{{item.createtime}}</span><span>{{item.memoname}}</span><span>{{item.corpcontentmemo}}</span><span>{{item.state==1?'通过':'未通过'}}</span></li><!-- <span><a href="javascript:;" class="btn" >编辑</a><a href="javascript:;" class="btn" >删除</a></span> -->
              </ul>
            </div>
          </div>
        </div>
      </div>
      <hr>
      <div class="item-content">
        <div class="panel panel-default">
          <a href="#page-stats3" class="panel-heading" data-toggle="collapse" >各组完成情况</a> 
          <div id="page-stats3" class="panel-collapse panel-body collapse in">
             <!--<div>
            <select class="selectpicker form-control1" style="width:120px;background-color:rgb(95, 111, 141);color:#fff;height: 34px;border-radius: 6px;display: inline-block;float: left;">
              <option v-for="item in taskList">{{item.taskname}}</option>
            </select>
            <select class="selectpicker form-control1" style="width:120px;background-color:rgb(95, 111, 141);color:#fff;height: 34px;border-radius: 6px;display: inline-block;float: right;">
              <option value="">今日</option>
              <option value="">三天</option>
              <option value="">一周</option>
              <option value="">一个月</option>
            </select>
            </div> -->
            <div class="row" style="margin-top: 20px;">
            <!-- <div class="knob-container">
                  <input class="knob" data-width="140" data-height="140" data-min="0" data-max="4500" data-displayPrevious="true" value="3299" data-fgColor="#92A3C2" data-readOnly=true;>
                  <h3 class="text-muted text-center">测试会议2</h3>
                </div> -->
              <div class="col-md-3 col-sm-6" v-for="item in itemList" style="display: flex;">
                <div class="r_out">
                  <div class="r_in" @click="itemDetail(item)">
                    <div class="r_c c1" :style="{height:item.percent + '%'}"></div>
                    <div class="r_num">{{item.percent}}%</div>
                  </div>
                  <p>{{item.groupname}}<br />完成数{{item.successcorp}}/总数{{item.countcorp}}</p>
                </div>
              </div>
            </div>
            <div class="itemdetail">
              <table class="table table-hover">
                <thead>
                  <tr>
                    <th>组员</th>
                    <th>完成数</th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for="item in itemInfoList">
                    <td>{{item.username}}</td>
                    <td>{{item.successcorp}}</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
      <footer style="margin: 0;">
        <hr>
        <!-- Purchase a site license to remove this link from the footer: http://www.portnine.com/bootstrap-themes -->
        <p class="pull-right"> <a href="http://www.chinayarn.com/mart/admin/login.asp" target="_blank">进入中国纱线网后台》》</a></p>
        <p>© 2017 <a href="http://svr.com" target="_blank">中国纱线网</a></p>
      </footer>
    </div>
    <div class="content notepage" style="margin-left:0px" v-if="!isNotePage">
      <div v-if="remarkType=='com'">
        <div class="header">
           <h1 class="page-title">企业备注</h1>
        </div>
        <div class="companyinfo">
          <h2>公司名称：{{companyInfo.CorpName}}  |  公司联系电话：{{companyInfo.CorpPhone}}/{{companyInfo.CorpPhone2}}  |  公司地址：{{companyInfo.Address}}</h2>
        </div>
      </div>
      <div v-else-if="remarkType=='pre'">
        <div class="header">
           <h1 class="page-title">个人备注</h1>
        </div>
        <div class="companyinfo">
          <h2>联系人：{{linkmanInfo.linkMan}}  |  职位：{{linkmanInfo.jobCate}}  |  电话号码：{{linkmanInfo.phone}}/{{linkmanInfo.mobile}}  |  公司名称：{{linkmanInfo.corpName}}</h2>
        </div>
      </div>
      <hr />
      <p style="margin:10px 0;color:#f00;">通过规则为:{{tasktgcontent.memoname}}</p>
      <form action="" style="min-height: 280px;position: relative;">
        <div class="writeNote">
          <textarea name="" id="" cols="60" rows="6" placeholder="填写企业备注" style="max-width: 100%;max-height: 230px;" v-model="submittext"></textarea>
        </div>
        <div class="row" style="margin:0;">
          <div class="col-md-2 col-sm-4" v-for="item in taskcontent">
            <label :for="item.id"><input type="checkbox" :id="item.id" :value="item.id" name="checkbox" v-model="submitcheck" />{{item.memoname}}</label> 
          </div>
        </div>
        <input type="submit" value="提交" class="btn btn-primary btn-lg" @click="companyRecordSubmit" style="position: absolute;bottom:6px;right: 40px;">
      </form>
      <hr />
      <div class="recordbox">
        <div class="recordlist">
          <ul class="ultable">
              <li><span>公司</span><span>任务名称</span><span>时间</span><span>反馈信息</span><span>联系意向</span><span>备注人</span></li>
            </ul>
            <ul class="ultable ultable_content">
              <li v-for="item in companyRecordList"><span>{{item.corpname}}</span><span>{{item.taskname}}</span><span>{{item.createtime}}</span><span>{{item.corpcontentmemo}}</span><span>{{item.memoname}}</span><span>{{item.username}}</span></li>
            </ul>
        </div>
        <div class="order"> 
          <a href="javascript:;" class="btn btn-primary" @click="comppanyorder">预约</a>
          <a href="javascript:;" class="btn btn-primary" @click="comppanyCollect">收藏</a>
          <a href="javascript:;" class="btn btn-primary" @click="comppanyImport">重点</a>
        </div>
      </div>
      <hr/>
    </div>
    <!-- 审批model -->
    <div class="modal fade bs-example-modal-lg" id="ApprovalModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel" style="display: inline-block;">对应任务-{{taskItem.taskname}}，公司-{{remarkApproveList.companyname}}的审批信息</h4>
            <a href="javascript:;" class="btn btn-primary" @click="ApprovaHistory">查看历史备注</a>
          </div>
          <div class="modal-body">
            <div style="height: 160px;overflow-y: auto;">
              <table class="table table-hover">
                <thead>
                  <tr>
                    <th>时间</th>
                    <th>联系人</th>
                    <th>联系人电话</th>
                    <th>备注信息</th>
                    <th>备注意向</th>
                    <th>备注人</th>
                  </tr>
                </thead>
                <tbody>
                  <tr v-for="item in remarkApproveList.data">
                    <td>{{item.createtime}}</td>
                    <td>{{item.linkname}}</td>
                    <td>{{item.linkphone}}</td>
                    <td>{{item.corpcontentmemo}}</td>
                    <td>{{item.memoname}}</td>
                    <td>{{item.username}}</td>
                  </tr>
                </tbody>
              </table>
            </div>
            <div  v-if="approvaHistoryList">
            <br><br><hr><br><br>
              <div style="height: 200px;overflow-y: auto;">
                <table class="table table-hover">
                  <tr>备注历史</tr>
                  <tr v-for="item in approvaHistoryList">
                    <td>{{item.createtime}}</td>
                    <td>{{item.linkman}}</td>
                    <td>{{item.linkphone}}联系电话</td>
                    <td>{{item.corpcontentmemo}}</td>
                    <td>{{item.memoname}}</td>
                    <td>{{item.realname}}</td>
                  </tr>
                </table>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-primary" @click="approvalSure">通过</button>
            <button type="button" class="btn btn-info" @click="approvalNo">不通过</button>
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          </div>
        </div>
      </div>
    </div>
    <!-- 点击公司model -->
    <div class="modal fade bs-example-modal-lg" id="remarkModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
      <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content companyRemakeModel">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title" id="myModalLabel">公司备注</h4>
          </div>
          <div class="modal-body">
            <div>
              <h3>公司信息</h3> <a href="javascript:;" class="btn btn-primary btn-xs editcombtn" v-if="!isEditCompany" @click="editCompnay">编辑</a> <a href="javascript:;" class="btn btn-primary btn-xs editcombtn" v-if="isEditCompany" @click="SureeditCompnay">确认提交</a>
              <ul class="comInfo" v-if="!isEditCompany">
                <li><span>公司名称：</span><span>{{companyInfo.CorpName}}</span></li>
                <li><span>公司地址：</span><span>{{companyInfo.Address}}</span></li>
                <li><span>公司类型：</span><span>{{companyInfo.CorpCateWu}}</span></li>
                <li><span>主营产品：</span><span>{{companyInfo.ProdMain}}</span></li>
                <li ><span>公司简介：</span><span style="max-height: 160px;overflow: auto;">{{companyInfo.Memo}}</span></li>
                <li><span>公司传真：</span><span>{{companyInfo.CorpFax}}</span></li>
                <li><span>公司电话：</span><span>{{companyInfo.CorpPhone}}</span></li>
                <li><span>是否为收费会员：</span><span>{{companyInfo.IsGood}}</span></li>
                <li><span>是否为重点企业：</span><span>{{companyInfo.Money}}</span></li>
                <li><span>是否为意向客户：</span><span>{{companyInfo.IsMaybeMoney}}</span></li>
              </ul>
              <ul class="comInfo" v-if="isEditCompany">
                <li><span>公司名称：</span><input type="text" v-model="companyInfo.CorpName"></li>
                <li><span>公司地址：</span><input type="text" v-model="companyInfo.Address"></li>
                <li><span>公司类型：</span><input type="text" v-model="companyInfo.CorpCateWu"></li>
                <li><span>主营产品：</span><input type="text" v-model="companyInfo.ProdMain"></li>
                <li ><span>公司简介：</span><textarea name="" id="" v-model="companyInfo.Memo" style="height: 160px;overflow: auto;"></textarea></li>
                <li><span>公司传真：</span><input type="text" v-model="companyInfo.CorpFax"></li>
                <li><span>公司电话：</span><input type="text" v-model="companyInfo.CorpPhone"></li>
                <li><span>是否为收费会员：</span><span>{{companyInfo.IsGood}}</span></li>
                <li><span>是否为重点企业：</span><span>{{companyInfo.Money}}</span></li>
                <li><span>是否为意向客户：</span><span>{{companyInfo.IsMaybeMoney}}</span></li>
              </ul>
              <a href="javascript:;" class="btn btn-primary btn-xs" @click="callCompany">联系公司</a>
            </div>
            <div>
              <h3>公司联系人</h3>
              <br>
              <div class="companyLinkman">
                <table class="table table-hover">
                  <tbody>
                    <tr v-for="item in companyLinkman" class="preList">
                      <td>{{item.linkMan}}</td>
                      <td>{{item.jobCate}}</td>
                      <td>{{item.phone}} / {{item.mobile}}</td>
                      <td>{{item.corpName}}</td>
                      <td><a href="javascript:;" class="btn btn-primary btn-xs" @click="callLinkman(item)">联系Ta</a>&nbsp;<a href="javascript:;" class="editprebtn" @click="editPre(item)">编辑Ta</a></td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <div class="editprebox" v-if="editpreInfo">
                <span>联系人：</span><input type="text" v-model="editpreInfo.linkMan" placeholder="输入姓名">
                <span>职位：</span><input type="text" v-model="editpreInfo.jobCate" placeholder="输入职位"><br>
                <span>手机号：</span><input type="text" v-model="editpreInfo.phone " placeholder="输入手机号">
                <span>联系电话：</span><input type="text" v-model="editpreInfo.mobile " placeholder="输入联系电话">
                <a href="javascript:;" class="btn btn-primary btn-xs" @click="sureEditPre">保存联系人</a>
              </div>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal" @click="notRemark">取消</button>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="../lib/bootstrap/js/bootstrap.js"></script>
  <script src="../../js/vue/vue2.js"></script>
  <script src="../../toastr/toastr.min.js"></script>
  <script src="../../js/Taskmain.js"></script>
</body>
</html>