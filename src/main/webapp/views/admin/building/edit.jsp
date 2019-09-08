<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:url var="url" value="/api-admin-building"></c:url>
</head>
<body>
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
							chủ</a></li>
					<li><a href="#">Thêm Tòa Nhà</a></li>
				</ul>
				<!-- /.breadcrumb -->
			</div>
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
						<form id="edit-form">
							<h2>Thông Tin Tòa Nhà</h2>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Tên
									sản phẩm</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="name"
										value="${ MODEL.name}" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Tên
									Quản Lý</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="manageName"
										value="${MODEL.manageName }" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Số
									Điện Thoại Quản Lý</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="managePhone"
										value="${MODEL.managePhone}" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Quận</label>
								<div class="col-sm-9 custom-div">
									<select name="district">
										<c:forEach var="i" items="${MODEL.listDistrict}">
											<c:if test="${i.name()==MODEL.district}">
												<option value="${i.name() }" selected>${i.getDistrict()}</option>
											</c:if>
											<c:if test="${i.name()!=MODEL.district}">
												<option value="${i.name() }">${i.getDistrict()}</option>
											</c:if>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Đường</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="street"
										value="${MODEL.street}" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Cấu
									Trúc</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="structure"
										value="${MODEL.structure}" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Diện
									tích thuê</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="rentArea"
										value="${MODEL.rentArea}" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Hướng</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="direction"
										value="${ MODEL.direction}" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Mô
									Tả Diện Tích</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="areaDescription"
										value="${MODEL.areaDescription }" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Chi
									Phí Thuê</label>
								<div class="col-sm-9 custom-div">
									<input type="number" class="form-control" name="rentCost"
										value="${MODEL.rentCost}" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Mô
									Tả Chi Phí Thuê</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="costDescription"
										value="${MODEL.costDescription}" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Phí
									Dịch Vụ</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="serviceCost"
										value="${MODEL.serviceCost }" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Phí
									Mô Tô</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="motorbikeCost"
										value="${MODEL.motorbikeCost}" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Phí
									Ô Tô</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="carCost"
										value="${MODEL.carCost}" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Phí
									Ngoài Giờ</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="overtimeCost"
										value="${MODEL.overtimeCost }" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Tiền
									Cọc</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="deposit"
										value="${MODEL.deposit }" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Thay
									Toán </label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="payment"
										value="${MODEL.payment }" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Thời
									Hạn Thuê</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="rentPeriod"
										value="${MODEL.rentPeriod }" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Số
									Tầng Hầm</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="numberOfBasement"
										value="${MODEL.numberOfBasement }" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label no-padding-right">Hạng</label>
								<div class="col-sm-9 custom-div">
									<input type="text" class="form-control" name="level"
										value="${MODEL.level }" />
								</div>
							</div>
							<div class="form-group">
								<div class="type-building">
									<c:forEach var="i" items="${MODEL.listBuildingType }">
										<c:set var="a" value="0"></c:set>
										<c:forEach var="j" items="${MODEL.buildingTypes }">
											<c:if test="${i.name()==j}">
												<c:set var="a" value="1"></c:set>
											</c:if>
										</c:forEach>
										<c:if test="${a==1 }">
											<input type="checkbox" name="buildingTypes" value="${i.name()}" checked/>
										</c:if>
										<c:if test="${a==0}">
											<input type="checkbox" name="buildingTypes" value="${i.name()}"/>
										</c:if>
										<label>${i.getBuildingType()}</label> 
									</c:forEach>
								</div>
							</div>
							<input type="hidden" value="${MODEL.id}" name="id" id="id"/>
						</form>
						<button class="btn btn-success custom-button" id="btnSubmit"
							type="submit">Thêm Bài Viết</button>
					</div>
				</div>
				<script type="text/javascript">
					$("#btnSubmit").click(function(e) {
						var arr = $("#edit-form").serializeArray();
						var obj = {};
						var dem = 0;
						var buildingTypes = [];
						for ( var i in arr) {
							if (arr[i].name === "buildingTypes") {
								buildingTypes.push(arr[i].value);
							} else
								obj[arr[i].name] = arr[i].value;
						}
						obj["buildingTypes"] = buildingTypes;
						if(($("#id").val()!=null) && ($("#id").val()!=0)){
							callAPI('PUT',obj,"UPDATE_SUCCESS","UPDATE_ERROR");
						}
						else{
							callAPI('POST',obj,"INSERT_SUCCESS","INSERT_ERROR");
						}
							
					});
					function callAPI(httpMethod,obj,success,error){
						$.ajax({
							//url : 'api-admin-building',
							url:'http://localhost:8087/api/admin/building/insert',
							dataType : 'json',
							type : httpMethod,
							data : JSON.stringify(obj),
							contentType : 'application/json',
							success : function(result) {
								console.log(result);
								window.location.href="/admin-home?type=list&message="+success+"&alert=success";
							},
							error : function(error) {
								console.log(error);
								window.location.href="/admin-home?type=list&message="+error+"&alert=error";
								
							}
						});
					}
				</script>
			</div>
		</div>
	</div>
</body>
</html>