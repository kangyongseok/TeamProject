(function($) {
	
	// 공통 코드
	CD = {
			// 성공
			reqSuccessCode: "200"
			// 실패
			, reqFailCode: "400"
	},
	// 공통 함수
	FN = {
			// 공백제거
			fnTrim: function(s){
				return s.replace(/ /gi, "");
			}
	}
	
})(jQuery);