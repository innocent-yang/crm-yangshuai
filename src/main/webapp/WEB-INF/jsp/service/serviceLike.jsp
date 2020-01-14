<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!-- 服务处理 -->
<div id="service">
  <div>
  <form class="form-inline">


</form>
</div>

<div>
	<table class="table table-hover">
		 <thead>
		    <tr style="background:#E8E8E8;">
		      <th>序号</th>
		      <th>客户名称</th>
		      <th>概要</th>
		      <th>服务类型</th>
		       <th>状态</th>		 
			  <th>操作</th>
		    </tr> 
		  </thead>

		  <tbody>
		    <c:forEach items="${serveInfo.list }" var="service">
		    <tr>
		      <td>${service.svrId }</td>
		      <td>${service.svrCustName }</td>
		      <td>${service.svrTitle }</td>
		      <td>${service.svrType }</td>
		      <td class="zhuangtai">${service.svrStatus }</td>
		      	<c:if test="${service.svrStatus=='已处理' }">
		      		<td>
		      		<i class="layui-icon layui-icon-edit editUser" title="编辑"></i> 
      	        	<i class="layui-icon layui-icon-ok updata" title="更新"></i> 
		      		</td>
		      	</c:if>
		      	<c:if test="${service.svrStatus=='处理中' }">
		      		<td>
		      		<i class="layui-icon layui-icon-edit editUser" title="编辑"></i> 
      	        	<i class="layui-icon layui-icon-ok updata" title="更新"></i>  
		      		</td>
		      	</c:if>
				<c:if test="${service.svrStatus=='已反馈' }">
		      		<td>
		      		<i class="layui-icon layui-icon-face-smile" title="详情"></i>  
		      		</td>
		      </c:if>
		    </c:forEach>
         </tbody>
    </table>
</div>
<div class="fenye">
			<table class="footTable">
				<tr>
					<td colspan="5">共${serveInfo.total } 条记录 每页${serveInfo.size } 条
						第${serveInfo.pageNum } 页 <a href="javascript:void(0)"
						onclick="pageSelect(1)">首页</a> <c:choose>
							<c:when test="${serveInfo.hasPreviousPage }">
								<a href="javascript:void(0)"
									onclick="pageSelect(${serveInfo.prePage})">上一页</a>
							</c:when>
							<c:otherwise>
								<font color="#ABA8AB">上一页</font>
							</c:otherwise>
						</c:choose> <c:choose>
							<c:when test="${serveInfo.hasNextPage }">
								<a href="javascript:void(0)"
									onclick="pageSelect(${serveInfo.nextPage})">下一页</a>
							</c:when>
							<c:otherwise>
								<font color="#ABA8AB">下一页</font>
							</c:otherwise>
						</c:choose> <a href="javascript:void(0)"
						onclick="pageSelect(${serveInfo.lastPage })">尾页</a>
					</td>
				</tr>

			</table>
		</div>
<!-- 新增模态框 -->
<div class="modal"  id="toAdd">
  <div class="modal-dialog" style="height:400px;overflow:auto;">
    <div class="modal-content">
       <form>
					<div class="modal-body">
						<div class="form-group">
							<label>服务类型:</label>
							<select name="city" id="" class="form-control">
							<option value="">请选择服务类型</option>
					        <option value="0">咨询</option>
					        <option value="1">投诉</option>
					        <option value="2">建议</option>
					        </select>
						</div>
						<div class="form-group">
							<label>概要:</label>
							<input type="text" name="msName" class="form-control">
						</div>
						<div class="form-group">
							<label>客户名称:</label>
							<input type="text" name="msName" class="form-control">
						</div>
						<div class="form-group">
							<label>状态:</label>
							<select name="city" id="" class="form-control">
							<option value="">请选择状态</option>
					        <option value="0">处理中</option>
					        <option value="1">已处理</option>
					        <option value="2">未处理</option>
					        </select>
						</div>
						<div class="form-group">
							<label>处理人:</label>
							<input type="text" name="msName" class="form-control">
						</div>
						<div class="form-group">
							<label>服务请求:</label>
							<input type="textarea" name="msName" style="height:60px" class="form-control">
						</div>
						<div class="form-group">
							<label>服务处理过程:</label>
							<input type="textarea" name="msName" style="height:60px" class="form-control">
						</div>
					</div>
				</form>
				<div class="modal-footer">
				    <button class="btn" style="background:#ccc">取消</button>
					<button class="btn" style="background:#ccc">保存</button>
				</div>
    </div>
  </div>
</div>

</div>
<style>
#service{
	width: 1140px;
	overflow: hidden;
}
.pagination > .active > a, .pagination > .active > a:focus, .pagination > .active > a:hover, .pagination > .active > span, .pagination > .active > span:focus, .pagination > .active > span:hover {
    background-color: #ccc;
    border-color: #ccc;
}
.pagination > li > a, .pagination > li > span {
    color: black;
}
.fenye{
	margin-left:400px;
}
	.form-inline{
		margin-top: 15px;
		margin-left: 10px;
		margin-bottom: 20px;
	}
	.search{
		margin-left: 50px;
	}
	#add{
		margin-left: 560px;
	}
	.table th,td{
		text-align: center;
	}
	#deleteModal{
		margin-top: 100px;
	}
	#toAdd{
		margin-top: 50px;
	}
</style>
<script type="text/javascript">
	function pageSelect(curPage){
		var url ="service/findServiceLike/" + curPage;
		$('.layui-body').load(url);
	}
	$(function(){
		$('.layui-icon-face-smile').click(function(){
			 $('.layui-body').load('./pages/serviceDetails2.html');  
		})
		// 点击新增显示模态框
		$('#add').click(function(){
			$('#toAdd').show();
		})
		// 新增模态框关闭
		$('button:contains(取消)').on('click',function(){
			$('button[type=reset]').trigger('click');
				$('#toAdd').hide();
		})
		// 新增模态框保存
		$('button:contains(保存)').on('click',function(){
				$('#toAdd').hide();
		})	
		// 点击编辑显示模态框
		$('.editUser').click(function(){
			$('#toAdd').show();
		})
		// 点击更新
		$('.updata').click(function(){
			var status = $(this).closest('tr').find('.zhuangtai').text();
			// console.log(status)
			if (status=='处理中') {
				alert('更新')
			}

		})
		// 查询
		$('.search').click(function(){
			alert('查询')
		})
		
	})
</script>