# 単体テスト仕様書

## テストクラス：`ActionProviderTest`

### テストケース

1. **createActionメソッド（showコマンド）**  
   - コマンド名が `"show"` のとき、`ShowTaskAction` が返されることを確認する。

2. **createActionメソッド（addコマンド）**  
   - コマンド名が `"add"` のとき、`AddTaskAction` が返されることを確認する。

3. **createActionメソッド（deleteコマンド）**  
   - コマンド名が `"delete"` のとき、`DeleteTaskAction` が返されることを確認する。

4. **createActionメソッド（無効なコマンド）**  
   - コマンド名が無効な場合に `null` が返されることを確認する。

---

## テストクラス：`AddTaskActionTest`

### テストケース

1. **executeメソッド（正常な入力）**  
   - 20文字以内のタスクが正常に追加されることを確認する。

2. **executeメソッド（長すぎる入力）**  
   - 21文字以上の入力が拒否され、「不正な入力です。」と出力されることを確認する。

---

## テストクラス：`DeleteTaskActionTest`

### テストケース

1. **executeメソッド（正常なID）**  
   - 有効なIDを持つタスクが削除されることを確認する。

2. **executeメソッド（無効なID）**  
   - 無効なID（数値以外）が入力された場合、「不正な入力です。」と出力されることを確認する。

---

## テストクラス：`CommandAnalyzerTest`

### テストケース

1. **analyzeメソッド（コマンドと引数）**  
   - 「`add task1`」という形式の文字列が正しく `Command` オブジェクトに変換されることを確認する。

2. **analyzeメソッド（引数なしのコマンド）**  
   - 「`show`」という形式の文字列が正しく `Command` オブジェクトに変換されることを確認する。
