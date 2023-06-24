package myapp.model.response.admin;

import lombok.Data;

/**
 * ユーザ一覧情報
 * - インデックス番号
 * - 名前
 * - 生年月日
 */
@Data
public class UserList {
	private int index;
	private String name;
	private String birth;

}
