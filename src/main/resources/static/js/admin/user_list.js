
//処理の定義
/**
 * クリック時対象の色を変化させる。
 */
function changeColorOnClick(id, color) {
	//idが一致する要素を取得する。
	const text = document.getElementById(id)
	//対象の要素が押されたときに色を変化させる。
	text.addEventListener("click", () => {
		text.style.color = color
	})
}



/**
 * 
 * ユーザ一覧の要素を作成する。
 * @param num 作成する要素の数
 */
function createList(num) {
	let parentFragment = document.createDocumentFragment()

	for (i = 0; i <= num; i++) {

		// 一番親になる要素	
		let li = document.createElement("li")

		// 3つのp要素をまとめるためのフラグメント
		let childFragment = document.createDocumentFragment();

		//p要素を作成
		let numberP = document.createElement("p")
		let nameP = document.createElement("p")
		let birthP = document.createElement("p")

		//挿入するテキストを作成
		const numberText = document.createTextNode(`No.1`)
		const nameText = document.createTextNode("山田太郎")
		const birthText = document.createTextNode("2000.10.10")

		// p要素にテキストを挿入
		numberP.append(numberText)
		nameP.append(nameText)
		birthP.append(birthText)

		// 3つのp要素
		childFragment.append(numberP)
		childFragment.append(nameP)
		childFragment.append(birthP)

		li.append(childFragment)
		parentFragment.append(li)
	}

	return parentFragment

}


/**
 * インフィニティスクロール
 * @param starRatet 処理実行位置（高さ）
 * @param add つ化する要素数
 */
function infinitScroll(startRate, add) {
	// スクロールを検知
	window.addEventListener("scroll", function() {
		// ページの高さを取得		
		const range = document.documentElement.scrollHeight - document.documentElement.clientHeight

		//現在位置を取得
		const currentLocation = document.documentElement.scrollTop;
		const heightRate = currentLocation / range

		if (heightRate >= startRate) {
			const list = document.querySelector("#scroll")
			//実際はAPIからデータを取得する処理を記載する
			list.append(createList(add))
		}
	})
}

/**
 * ポップアップの開閉
 */
function popupOperation() {
	// 開閉用のボタン
	let popupButton = document.querySelector(".popup_btn")
	popupButton.addEventListener("click", () => {
		let popup = document.querySelector(".popup")
		
		// styleに値がないもしくはnoneの場合は"display:blovk"にそうでない場合はnoneに
		if (popup.style.display == "none" || popup.style.display == "") {
			popup.style.display = "block"
		} else {
			popup.style.display = "none"
		}

	})
	
	//オーバーレイの部分
	let overlay = document.querySelector(".popup_overlay")
	overlay.addEventListener("click", () => {
		let popup = document.querySelector(".popup")
		//ポップアップをとじる
		popup.style.display = "none"
	})
}



const INFINIT_SCROLL_HEIGHT_RATE = 0.9
const ADD_ITEM_NUM = 8

// 処理の実行
changeColorOnClick("text", "red")
infinitScroll(INFINIT_SCROLL_HEIGHT_RATE, ADD_ITEM_NUM)
popupOperation()































