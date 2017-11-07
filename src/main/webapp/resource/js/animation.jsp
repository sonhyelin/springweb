<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
	/* $(function(){
	   var button = $("input[type='button']");
	   
	   button.click(function(e){
	      alert("눌림");
	   });
	
	}); */
	
	/////////애니메이션 구현 기술 3가지
	//1. 스크립트 절차를 직접 이용한 애니메이션
	//2. jQuery와 같은 라이브러리를 이용한 애니메이션
	//3. css3 애니메이션 기능을 이용한 애니메이션
	
	//1. 스크립트 절차를 직접 이용한 애니메이션
		   function animate(target, to) {

      var timer = setInterval(function() {
         var width = parseInt(target.style.width);
         target.style.width = (width + 1) + "px"; // if문 위에 쓰면 width>=200으로 작성 / 아래에 쓰면 width > 200

         if (width > 200)
            clearInterval(timer);

      }, 17);

   }
	
	window.addEventListener("load", function(event){
	   var widthButton = document.querySelector("#ex1-tool input[value='너비늘리기']");
	   var item = document.querySelector("#ex1-box .item1");
	  
	   
	   widthButton.onclick = function(e){
		 //2. 애니메이션을 animatie 함수로 리팩토링
			//animate(item, 200);
		 
			//1. 일일히 개별적으로 작성한 애니메이션
	     /*  if(timer == null)
	      timer = setInterval(function(){
	         var width =parseInt(item.style.width);//정수형으로 값을 뽑아낸다.
	         item.style.width = (width+1)+"px";
	         
	         if(width>200)
	          clearInterval(timer);
	
	      }, 17); //1000/60
		 */	
		 
		 //CSS3에 추가된 변화속성
		 //item.style.width?
	     //item.style.left?
	     item.style.transform(a, b, c, d, e, f);
	      
		 
	   };
	   
	});
	///이렇게 하는 것 보다는 라이브러리화 시켜넣는 방법이 있다.
	
	//3. jQuery와 같은 라이브러리를 이용한 애니메이션
	$(function(){
		var widthButton = $("#ex1-tool input[value='너비늘리기']");
		   var item = $("#ex1-box .item1");
		  
		   
		   widthButton.click(function(e){
			   
				//1. 한번에 변화를 주는 방법 from -> to
				//item.css("width", "200px");
				/* item.css({
					width:"200px"
				}); */
				
				//2. 기간(duration)을 두고 점진적으로  변화를 주는 방법
			   item.animate({
					width:"200px"
				}, 2000,"linear", function(){
					//alert("야호오");
				});
		
		   });
	});
	
</script>
</head>
<body>
   <div id="ex1-tool">
      <input type="button" value="너비늘리기">
   </div>
   <!--    1.너비를 변경하는 애니메이션 -->
   <div id="ex1-box" style="width: 500px; height: 300px; background: gray;">
      <div class="item1" style="transform:rotate(45deg) ;width: 100px; height: 100px; background: yellow;"></div>
   </div>
</body>
</html>