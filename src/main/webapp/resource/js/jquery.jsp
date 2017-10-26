<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	//window.addEventListener("load", function(){
	$(function(){	
		//DOM 객체
		//var _chButton = document.getElemenById("ch-button");
		//jQuery 객체로 바꾸는 방법 1 : jQuery 함수 이용하기
		//var chButton = jQuery(_chButton); //이렇게 하면 jQuery 객체가 된다
		
		//jQuery 객체로 바꾸는 방법 2 : $ 함수 이용하기
		//var chButton = $(_chButton); 
		
		//jQuery 객체로 바꾸는 방법 3 : CSS Selector 이용하기
		var chButton = $("#ch-button");
		
		//이베트 바인딩 두 가지 옵션 : 첫번째 범용 이벤트 바인딩 함수 on()
		/* chButton.on("click", function() {
			alert("dd");
		}); */
		
		//이베트 바인딩 두 가지 옵션 : 두번째 특수 이벤트 바인딩 함수 click/keydown...()
		chButton.click(function(){
			/* alert("dd"); */
			
			//여러개의 스타일을 설정해야 하는 경우 : 방법 1
			$("#p").css("background", "red");
			
			//여러개의 스타일을 설정해야 하는 경우 : 방법 2
			$("#p").css({
				background : "red",
				"font-size" : "23px" // - 가 들어가서 "" 로 감싸줘야 한다
			});
		});
		
	});
</script>
</head>
<body>

<!-- 노드 순환 예제 -->
<input id="ch-button" type="button" value="배경색 변경" />
	<div>
		<div>1</div>
		<div id="p">
			<div>2</div>
		</div>
		<div>3</div>
	</div>

</body>
</html>