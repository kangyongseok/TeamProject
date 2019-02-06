<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>유저 폼</title>
</head>
<body>
	
<c:set var="exist" value="${not empty dataBean.userId}" />
	
<script>
	
	// 등록 & 수정
	function onAction(f){
		
		// 필수항목 validate
		if ( FN.fnTrim(f.userId.value) == "" ) {
			alert("아이디를 입력해주세요");
			f.userId.focus();
			return false;
		} else if ( FN.fnTrim(f.userPwd.value) == "" ) {
			alert("비밀번호를 입력해주세요");
			f.userPwd.focus();
			return false;
		} else if ( f.userPwd.value != f.userPwd2.value ) {
			alert("비밀번호와 비밀번호 확인 입력이 다릅니다.\n다시 입력해주세요.");
			f.userPwd2.focus();
			return false;
		} else if ( f.userDiv.value == "" ){
			alert("회원구분을 선택해주세요");
			f.userDiv.focus();
			return false;
		} else if ( FN.fnTrim(f.name.value) == "" ){
			alert("이름을 입력해주세요");
			f.name.focus();
			return false;
		}
		
		// 등록 수정 구분에 따른 action
		var cmd = f.cmd.value;
		var actionUrl = cmd == "I" ? "AR_insertAction.do" : "AR_updateAction.do";
		f.action = actionUrl;
		
		var param = $("#form").serialize();
		
		// submit
		$.ajax({
			url: actionUrl
			, type: "GET"
			, data: param
			, success: function(data){
				console.log("성공");
				console.log(data);
				if ( data == CD.reqSuccessCode ){
					if ( cmd == "I") alert("회원정보가 정상적으로 등록되었습니다.");
					else alert("회원정보가 정상적으로 수정되었습니다.");
					location.href = "/bo/user/NR_index.do";
				} else {
					alert("회원정보 등록(수정)에 실패하였습니다. 다시 시도해주시기바랍니다.");
				}
			}, error: function(){
				console.log("실패")
				alert("회원 정보 등록(수정)에 실패하였습니다. 다시 시도해주시기바랍니다.")
			}
		});
	}
	
	// 목록 이동
	var locationBack = function(){
		if ( confirm("목록으로 이동 시에 입력하신 내용을 상실합니다.\n이동하시겠습니까?") ){
			location.href="/bo/user/NR_index.do";
		}
	}
	
	// id check
	var idCheck = function(){
		var id = document.getElementById("userId").value;
		console.log(id);
	}
</script>

<!-- Page Heading -->
<h1 class="h3 mb-2 text-gray-800">회원상세</h1>


<!-- DataTales Example -->
<div class="card shadow mb-4">
  <div class="card-header py-3">
    <h6 class="m-0 font-weight-bold text-primary">회원상세</h6>
  </div>
  <div class="card-body">
    <!-- 회원상세 -->
      <div class="panel panel-default">
          <div class="panel-body">
              <form id="form" name="form" role="form" class="panel-body" enctype="multipart/form-data">
					<input type="hidden" name="cmd" value="${dataBean.cmd}">
                  <div class="row">
                      <div class="col-lg-6">
                          <div class="form-group">
                              <label for="userId">* ID</label>
                              <c:if test="${exist}">
                              	<input type="text" name="userId" id="userId"class="form-control" placeholder="아이디" value="${dataBean.userId}" readonly />
                              </c:if>
                              <c:if test="${!exist}">
                              	<input type="text" name="userId" id="userId"class="form-control" placeholder="아이디" />
                              	<button type="button" id="idCheck" class="btn btn-warning" onclick="idCheck()">중복확인</button>
                              </c:if>
                          </div>
                          <div class="form-group">
                              <label for="userPwd">* 패스워드</label> 
                              <input type="password" name="userPwd" id="userPwd" class="form-control" placeholder="비밀번호" value="${dataBean.userPwd}" /> 
                              <span class="mt5" id="user_pwd_msg"></span>
                          </div>
                          <div class="form-group">
                              <input type="password" name="userPwd2" id="userPwd2" class="form-control" placeholder="비밀번호 확인" value="" /> 
                              <span class="mt5" id="user_pwd_msg"></span>
                          </div>
                          <div class="form-group">
                              <label for="userDiv">* 회원구분</label>
                              <select id="userDiv" name="userDiv" class="form-control">
                              	<option value="1">관리자</option>
                              	<option value="2">일반</option>
                              </select>
                          </div>
                          
                          <div class="form-group">
                              <label for="name">* 이름</label> 
                              <input type="text" name="name" id="name" class="form-control" placeholder="이름" value="${dataBean.name}" />
                          </div>              
                      </div>
                      <div class="col-lg-6">
                          <div class="form-group">
                              <label for="">주소</label>
                              <div class="row">
                                  <div class="col-xs-8">
                                      <input type="text" name="post" id="post" class="form-control" placeholder="우편번호" value="${dataBean.post}" readonly />
                                  </div>
                                  <div class="col-xs-4">
                                      <button type="button" class="btn btn-warning" onclick="findAddress()">주소찾기</button>
                                  </div>
                              </div>
                          </div>
                          <div class="form-group">
                              <input type="text" name="addr1" id="addr1" class="form-control" placeholder="지번주소" value="${dataBean.addr1}" readonly />
                          </div>
                          <div class="form-group">            
                              <input type="text" name="addr2" id="addr2"class="form-control" placeholder="상세주소" value="${dataBean.addr2}" />
                          </div>
                          
                          <div class="form-group">
                              <label for="tel">연락처</label> <input type="text" id="tel" name="tel" placeholder="연락처" class="form-control" value="${dataBean.tel}" />
                          </div>
                          
                          <div class="form-group">
                              <label for="regDt">가입일시</label> <input type="text" id="regDt" class="form-control" value="${dataBean.regDt}" readonly />
                          </div>
                          
                          <div class="form-group">
                              <label for="modiDt">수정일시</label> <input type="text" id="modiDt" class="form-control" value="${dataBean.modiDt}" readonly />
                          </div>
                          
                          </div>
                          <div class="col-lg-12">
                              <div class="form-group text-right">
                                  <button type="button" class="btn btn-warning" onclick="locationBack()">목록</button>
                                  <button type="button" class="btn btn-primary" onclick="onAction(this.form)">회원수정</button>
                              </div>
                          </div>
                      </div>
              </form>
          </div>
          
      </div>
      <!-- //회원상세 -->
     </div>
</div>
	    
</body>
</html>
