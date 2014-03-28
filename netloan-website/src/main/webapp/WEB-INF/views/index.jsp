<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="inc.jsp"/>
  </head>

  <body>
  <jsp:include page="nav.jsp"/>

    <!-- Carousel ============================= -->
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner">
        <div class="item active">
          <img src="${pageContext.request.contextPath}/resources/images/index/3.jpg" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
            </div>
          </div>
        </div>
        <div class="item">
          <img src="${pageContext.request.contextPath}/resources/images/index/2.jpg" alt="Second slide">
          <div class="container">
            <div class="carousel-caption">
            </div>
          </div>
        </div>
        <div class="item">
          <img src="${pageContext.request.contextPath}/resources/images/index/1.jpg" alt="Third slide">
          <div class="container">
            <div class="carousel-caption">
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
    </div><!-- /.carousel -->

    <!-- Marketing messaging and featurettes ====================== -->
    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
      	<div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/5.jpg"  alt="Generic placeholder image">
          <h2>信用借款</h2>
          <p>成为借款人，按照要求完善信用信息，获得信用认证后，通过发标进行借款，最快2.5小时可获得所需资金。</p>
          <p><a class="btn btn-default" href="${ctx}/borrowingProcess.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/4.jpg" alt="Generic placeholder image">
          <h2>投资理财</h2>
          <p>成为理财人，通过主动投标或加入优选理财计划将资金进行出借投资，可获得预期12%-14%的稳定年化收益。</p>
          <p><a class="btn btn-default" href="${ctx}/investmentProcess.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img src="${pageContext.request.contextPath}/resources/images/index/6.jpg"  alt="Generic placeholder image">
          <h2>安全保障</h2>
          <p>所有投资标的100%适用本金保障计划，如遇借款人违约，人人贷将通过风险备用金有效保障理财人的本金安全。</p>
          <p><a class="btn btn-default" href="${ctx}/riskGuarantee.htm" role="button">查看详情 >></a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

	  <h3>投资列表</h3>
      <div class="row featurette">
        <div class="col-md-12">
          <table class="table table-bordered">
	        <thead>
	          <tr>
	            <th>借款标题</th>
	            <th>信用等级</th>
	            <th>年利率</th>
	            <th>金额</th>
	            <th>期限</th>
	            <th>进度</th>
	          </tr>
	        </thead>
	        <tbody>
	          <tr>
	            <td>装修资金周转</td>
	            <td>HR</td>
	            <td>18.00%</td>
	            <td>10000元</td>
	            <td>6个月</td>
	            <td>@100%</td>
	          </tr>
	          <tr>
	            <td>Jacob</td>
	            <td>Jacob</td>
	            <td>Thornton</td>
	            <td>@fat</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	          </tr>
	          <tr>
	            <td>Jacob</td>
	            <td>Jacob</td>
	            <td>Thornton</td>
	            <td>@fat</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	          </tr>
	          <tr>
	            <td>Jacob</td>
	            <td>Jacob</td>
	            <td>Thornton</td>
	            <td>@fat</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	          </tr>
	          <tr>
	            <td>Jacob</td>
	            <td>Jacob</td>
	            <td>Thornton</td>
	            <td>@fat</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	          </tr>
	      	</tbody>
	      	<tfoot>
	          <tr>
	            <th colspan="7"><h4 align="center"><a  href="#" >查看更多投资消息 >></a></h4></th>
	          </tr>
	        </tfoot>
	      </table>
        </div>
      </div>

	  <h3>借款列表</h3>
      <div class="row featurette">
        <div class="col-md-12">
          <table class="table table-bordered">
	        <thead>
	          <tr>
	            <th>借款标题</th>
	            <th>信用等级</th>
	            <th>年利率</th>
	            <th>奖励</th>
	            <th>金额</th>
	            <th>期限</th>
	            <th>进度</th>
	          </tr>
	        </thead>
	        <tbody>
	          <tr>
	            <td>某选煤厂流转借款标</td>
	            <td>一级</td>
	            <td>13%</td>
	            <td>1%</td>
	            <td>20000元</td>
	            <td>一年</td>
	            <td>15%</td>
	          </tr>
	          <tr>
	            <td>Jacob</td>
	            <td>Jacob</td>
	            <td>Thornton</td>
	            <td>@fat</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	          </tr>
	          <tr>
	            <td>Jacob</td>
	            <td>Jacob</td>
	            <td>Thornton</td>
	            <td>@fat</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	          </tr>
	          <tr>
	            <td>Jacob</td>
	            <td>Jacob</td>
	            <td>Thornton</td>
	            <td>@fat</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	          </tr>
	          <tr>
	            <td>Jacob</td>
	            <td>Jacob</td>
	            <td>Thornton</td>
	            <td>@fat</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	            <td>@mdo</td>
	          </tr>
	      	</tbody>
	      	<tfoot>
	          <tr>
	            <th colspan="7"><h4 align="center"><a  href="#" >查看更多借款消息 >></a></h4></th>
	          </tr>
	        </tfoot>
	      </table>
        </div>
      </div>

 	  <h3>最新公告</h3>
      <div class="row featurette">
        <div class="col-md-12">
          <table class="table table-hover">
	      	<tbody>
	          	<c:forEach items="${announcementDatas.rows}" var="announcement" begin="0" end="4" step="1">
			          <tr>
			            <td class="col-md-8">${announcement.webAnnTheme}</td>
			            <td class="col-md-2"><fmt:formatDate value="${announcement.createTime}" type="both"/></td>
			          	<td class="col-md-2"><a href="${ctx}/announcement/announcementDetail.htm?&webAnnId=${announcement.webAnnId}">查看详细</a></td>
			          </tr>
		      	</c:forEach>
		    </tbody>
	      	<tfoot>
	          <tr>
	            <th colspan="3"><h4 align="center"><a  href="${ctx}/announcement/announcement.htm?&p=1" >查看更多网站公告 >></a></h4></th>
	          </tr>
	        </tfoot>
	      </table>
        </div>
      </div>
      
      <h3>最新新闻</h3>
      <div class="row featurette">
        <div class="col-md-12">
          <table class="table table-hover">
	      	<tbody>
          		<c:forEach items="${newsDatas.rows}" var="news" begin="0" end="4" step="1">
		          <tr>
		            <td class="col-md-8">${news.webNewsTheme}</td>
		            <td class="col-md-2"><fmt:formatDate value="${news.createTime}" type="both"/></td>
		          	<td class="col-md-2"><a href="${ctx}/news/newsDetail.htm?&webNewsId=${news.webNewsId}">查看详细</a></td>
		          </tr>
	      		</c:forEach>
	      	</tbody>
	      	<tfoot>
	          <tr>
	            <th colspan="3"><h4 align="center"><a  href="${ctx}/news/news.htm?&p=1" >查看更多网站新闻 >></a></h4></th>
	          </tr>
	        </tfoot>
	      </table>
        </div>
      </div>
      
      <hr class="featurette-divider2">

      <!-- /END THE FEATURETTES -->
      <form id="personalMessageForm"  class=" form-horizontal" role="form" action="${pageContext.request.contextPath}/perfectRegister.htm" method="post" >
      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
		<label for="personalDes" class="col-sm-2 control-label">个人头像:</label>
	     <div class="col-sm-10" style="float: left;">
			<div style="float: left;padding-right: 20px;">
			<input class="ke-input-text" type="text" name="memberPhoto" id="url" value="${currentMember.memberPhoto}" readonly="readonly" />
			<input type="button" id="uploadButton" value="Upload" />
			</div>
			<div id="memberPhotoDiv" style="width: 120px;height: 120px ;margin-left:50px;float: left;border: 1px solid;">
			
			</div>
			
	    <%--  <div class="form-group">
		    <label for="unitName" class="col-sm-2 control-label">单位名称:</label>
		    <div class="col-sm-4">
		      <input type="text" class="form-control" id="unitName" name="unitName" value="${currentMemberWork.unitName}"  placeholder="单位名称">
		    </div>
		  </div> --%>
		   <button  id="login_submit" type="submit" class="btn btn-primary btn-lg">提交</button>
	    </div> 
	   </form>
      <!-- FOOTER -->
        <jsp:include page="foot.jsp"/>

    </div>
	<!-- /.container -->
  </body>
   <script type="text/javascript">
	    
	    //个人头像上传。
	    KindEditor.ready(function(K) {
				var uploadbutton = K.uploadbutton({
					button : K('#uploadButton')[0],
					fieldName : 'imgFile',
					url : ctx+'/member/uploadFile.htm?dir=image',
						//'../php/upload_json.php?dir=file'
					afterUpload : function(data) {
						if (data.error === 0) {
							var url = K.formatUrl(data.url, 'domain');
							K('#url').val(url);
							K('#url').html(url);
							$("#memberPhotoDiv").append("<img src="+url+" style='"+"width: 120px;height: 120px ;'"+" />");
							//$("#memberPhotoDiv").html(url);
						} else {
							alert(data.message);
						}
					},
					afterError : function(str) {
						alert('自定义错误信息: ' + str);
					}
				});
				uploadbutton.fileBox.change(function(e) {
					uploadbutton.submit();
				});
			});
	</script>
</html>