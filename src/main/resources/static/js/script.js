/**
 * 
 */


//半角数値チェック
function check() {
	var dispNo = document.disp_form.disp_no.value;
	//半角数字かチェック
	if (dispNo.match(/[^0-9]+/)) {
		document.getElementById("errmsg").innerHTML="半角数値で入力してください";
		return false;
	} else {
		//何もしない
		return true;
	}
}

//クリアボタン押下
function clear() {
	document.getElementsByName("name")[0].value = "";
	document.getElementsByName("contents")[0].value = "";	
}
var clearBtn = document.getElementById("clear");
if (clearBtn == null) {
	
} else {
	clearBtn.addEventListener("click", clear);
}

//キャンセルボタン押下
var cancelBtn = document.getElementById("cancel");
if (cancelBtn == null ) {
	
} else {
	cancelBtn.addEventListener("click", function() {history.back();});
}

