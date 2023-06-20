
//処理の定義
/**
 * クリック時対象の色を変化させる。
 */
function ChangeColorOnClick(id,color){
	//idが一致する要素を取得する。
	const text = document.getElementById(id)
	//対象の要素が押されたときに色を変化させる。
	text.addEventListener("click",() => {		
		text.style.color = color
	})
}

// 処理の実行
ChangeColorOnClick("text","red")