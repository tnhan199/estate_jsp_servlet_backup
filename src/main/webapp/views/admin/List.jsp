<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
label {
	font-weight: 700;
}
</style>
</head>
<body>
	<div class="main-content">
		<div class="breadcrumbs ace-save-state" id="breadcrumbs">
			<ul class="breadcrumb">
				<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
						chủ</a></li>
			</ul>
			<!-- /.breadcrumb -->
		</div>
		<div class="widget-box table-filter">
			<div class="widget-header">
				<h4 class="widget-title">Tìm kiếm</h4>
				<div class="widget-toolbar">
					<a href="#" data-action="collapse"> <i
						class="ace-icon fa fa-chevron-up"></i>
					</a>
				</div>
			</div>
			<div class="widget-body">
				<div class="widget-main">
					<div class="form-horizontal">
						<form action="admin-home?type=search" method="get" id="formSearch">
							<div class="form-group">
								<div class="col-sm-6">
									<label class="custom-label">Tên Sản phẩm</label>
									<div class="fg-line">
										<input type="text" class="form-control input-sm" name="name"
											value="${MODEL.name}" />
									</div>
								</div>
								<div class="col-sm-6">
									<label class="custom-label">Diện tích sàn</label>
									<div class="fg-line">
										<input type="text" class="form-control input-sm"
											name="buildingArea" value="${MODEL.buildingArea}" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-3">
									<label class="custom-label" style="font-weight: 800;">Quận
										hiện có</label>
									<div class="fg-line">
										<select class="form-control" id="sel1" name="district">
											<option></option>
											<c:forEach var="i" items="${MODEL.listDistrict }">
												<option value="${i.name()}">${i.getDistrict()}</option>
											</c:forEach>
										</select>
									</div>
								</div>
								<div class="col-sm-3">
									<label class="custom-label">Phường</label>
									<div class="fg-line">
										<input type="text" class="form-control input-sm" name="ward"
											value="${MODEL.ward }" />
									</div>
								</div>

								<div class="col-sm-3">
									<label class="custom-label">Đường</label>
									<div class="fg-line">
										<input type="text" class="form-control input-sm" name="street"
											value="${MODEL.street}" />
									</div>
								</div>
								<div class="col-sm-3">
									<label class="custom-label">Số Tầng Hầm</label>
									<div class="fg-line">
										<input type="text" class="form-control input-sm"
											name="numberOfBasement" value="${MODEL.numberOfBasement }" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-3">
									<label class="custom-label">Diện tích từ</label>
									<div class="fg-line">
										<input type="text" class="form-control input-sm"
											name="rentAreaFrom" value="${MODEL.rentAreaFrom}" />
									</div>
								</div>
								<div class="col-sm-3">
									<label class="custom-label">Diện tích đến</label>
									<div class="fg-line">
										<input type="number" class="form-control input-sm"
											name="rentAreaTo" value="${MODEL.rentAreaTo}" />
									</div>
								</div>
								<div class="col-sm-3">
									<label class="custom-label">Giá thuê từ</label>
									<div class="fg-line">
										<input type="number" class="form-control input-sm"
											name="rentCostFrom" value="${MODEL.rentCostFrom}" />
									</div>
								</div>
								<div class="col-sm-3">
									<label class="custom-label">Giá thuê đến</label>
									<div class="fg-line">
										<input type="number" class="form-control input-sm"
											name="rentCostTo" value="${MODEL.rentCostTo}" />
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-5">
									<label class="custom-label">Tên Quản Lý</label>
									<div class="fg-line">
										<input type="text" class="form-control input-sm"
											name="manageName" value="${MODEL.manageName}" />
									</div>
								</div>
								<div class="col-sm-5">
									<label class="custom-label">Điện Thoại Quản Lý</label>
									<div class="fg-line">
										<input type="text" class="form-control input-sm"
											name="managePhone" value="${MODEL.managePhone}" />
									</div>
								</div>
								<div class="col-sm-2">
									<label class="custom-button">Chọn nhân viên quản lý</label>
									<div class="fg-line">
										<select class="form-control" id="sel1">
											<option>1</option>
											<option>2</option>
											<option>3</option>
											<option>4</option>
										</select>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="type-building">
									<c:forEach var="i" items="${MODEL.listBuildingType}">
										<c:set var="a" value="0"></c:set>
										<c:forEach var="j" items="${MODEL.buildingTypes}">
											<c:if test="${i.name()==j}">
												<c:set var="a" value="1"></c:set>
											</c:if>
										</c:forEach>
										<c:choose>
											<c:when test="${a==1}">
												<input type="checkbox" name="buildingTypes"
													value="${i.name()}" checked />
											</c:when>
											<c:otherwise>
												<input type="checkbox" name="buildingTypes"
													value="${i.name()}" />
											</c:otherwise>
										</c:choose>

										<label class="custom-label">${i.getBuildingType()}</label>
									</c:forEach>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-12">
									<div class="fg-line">
										<button class="btn btn-success custom-button" id="btnSearch">Tìm
											kiếm</button>
									</div>
								</div>
							</div>
							<input name="type" type="hidden" value="search" /> 
							<input name="maxPageItem" type="hidden" value="3" /> 
							<input name="page" value="${MODEL.page}" id="page" type="hidden"/>
							<input name="totalPage" value="${MODEL.totalPage }" id="totalPage" type="hidden"/>
						</form>

					</div>
				</div>
			</div>
		</div>
		<div class="table-btn-controls">
			<div class="pull-right tableTools-container">
				<div class="dt-buttons btn-overlap btn-group">
					<a flag="info"
						class="dt-button buttons-colvis btn btn-white btn-primary btn-bold"
						data-toggle="tooltip" title='Thêm tòa nhà'
						href='admin-home?type=insert'> <span><i
							class="fa fa-plus-circle bigger-110 purple"></i></span>
					</a>
					<button type="button"
						class="dt-button buttons-html5 btn btn-white btn-primary btn-bold"
						data-toggle="tooltip" title='Xóa tòa nhà' id="btnDelete">
						<span><i class="fa fa-trash-o bigger-110 pink"></i></span>
					</button>
				</div>
			</div>
		</div>
		<div class="table-header" style="clear: right">Danh sách Tòa Nhà</div>
		<div class="dataTables_wrapper form-inline no-footer">
			<div class="row">
				<div class="col-xs-6">
					<div class="dataTables_length">
						<label>Display <select aria-controls="dynamic-table"
							class="form-control input-sm" id="maxPageItem">
								<option value="5">5</option>
								<option value="10">10</option>
								<option value="15">15</option>
						</select> Records
						</label>

					</div>
				</div>
			</div>
			<table class="table table-bordered table-striped"
				style="margin-bottom: 0px">
				<thead>
					<tr>
						<th scope="col"><input type="checkbox" id="checkAll"/></th>
						<th scope="col">Tên Sản Phẩm</th>
						<th scope="col">Địa Chỉ</th>
						<th scope="col">Diện Tích Thuê</th>
						<th scope="col">Giá Thuê</th>
						<th scope="col">Tên Quản Lý</th>
						<th scope="col">Điện Thoại Quản Lý</th>
						<th scope="col">Loại Tòa Nhà</th>
						<th scope="col">Số Tầng Hầm</th>
						<th scope="col">Thao Tác</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="i" items="${MODEL.listResult}">
						<tr>
							<th scope="row"><input type="checkbox" value="${i.id}"/></th>
							<td>${i.name}</td>
							<td>${i.location }</td>
							<td>${i.rentArea}</td>
							<td>${i.rentCost }</td>
							<td>${i.manageName }</td>
							<td>${i.managePhone }</td>
							<td>${i.type }</td>
							<td>${i.numberOfBasement }</td>
							<td>
								<div class="hidden-sm hidden-xs action-buttons">
									<a href="#" class="blue"> <i
										class="ace-icon fa fa-search-plus bigger-130"> </i>
									</a> <a href="admin-home?id=${i.id}&type=insert" class="green"> <i
										class="ace-icon fa fa-pencil bigger-130"> </i>
									</a>
								</div>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="row">
				<div class="col-xs-6">
					<div class="dataTables_info" id="dynamic-table_info" role="status"
						aria-live="polite" style="padding-top: 25px;">Showing 1 to
						10 of 23 entries</div>
				</div>
				<div class="col-xs-6">
					<nav aria-label="Page navigation">
						<ul class="pagination" id="pagination"></ul>
					</nav>
					<script type="text/javascript">
						var current=parseInt($("#page").val());
						var totalPage=parseInt($("#totalPage").val());
						$(function() {
							window.pagObj = $('#pagination').twbsPagination({
								totalPages:totalPage,
								visiblePages:10,
								startPage:current,
								onPageClick: function(event, page) {
									if($("#page").val()!=page){
										$("#page").val(page);
										console.log($("#page").val());
										$("#formSearch").submit();
									}
								}
							})
						});
					</script>
				</div>
			</div>
		</div>

	</div>
<script type="text/javascript">
	$(document).ready(function(){
		$("#btnSearch").click(function(){
			$("#page").val(1);
			console.log("haha hahaa");
			$("#formSearch").submit();
		
			
		});
		$(".table :checkbox").click(function(){
			if(this.id=="checkAll"){
				if(this.checked==true){
					$("tbody :checkbox").prop("checked",true);
				}
				else{
					$("tbody :checkbox").prop("checked",false);
				}
			}
			else{
				if(this.checked==false){
					$("#checkAll").prop("checked",false);
				}
				else{
					var c=0;
					var arr=$(".table :checkbox :not(#checkAll)");
					
					$(".table :checkbox:not(#checkAll)").each(function(i,e){
						console.log(i);
						console.log($(e).prop("checked"));
						if(!$(this).prop("checked")){
							c=1;
						}
					});
					if(c==0){
						$("#checkAll").prop("checked",true);
					}
				}
			}
		});
		$("#btnDelete").click(function(){
			var obj={};
			obj["listId"]=[];
			$(".table :checkbox:not(#checkAll)").each(function(i,e){
				if($(e).prop("checked"))
					obj["listId"].push($(e).val());
			});
			console.log(obj);
			$.ajax({
				url:"api-admin-building",
				dataType:"json",
				type:"delete",
				data:JSON.stringify(obj),
				contentType:"application/json",
				success:function(result){
					console.log(result);
				},
				error:function(xhr,status,error){
					console.log(error);
				}
			});
		});
	});
</script>
</body>
</html>