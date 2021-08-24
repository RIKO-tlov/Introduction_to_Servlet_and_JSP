/*3-1
1 /ex1
2 doGet
3 text/html; charset=UTF-8
4 response
*/

/*3-2
ブラウザの動作
コード3の部分をABCDEに修正してブラウザから実行すると、多くのブラウザはサーバから送られてきたHTML文字列を画面に表示せず、
ファイルとして保存しようと動作する。

動作の理由
ブラウザは、Content-Typeヘッダを見て、レスポンスのボディ部の情報がHTMLであると理解し、HTMLコードを正しく表示します。
しかし、3の部分を変更すると、ブラウザに返されるHTTPレスポンス中のContent-TypeヘッダもABCDEという値に変化します。
ブラウザは、Content-Typeを見ても、レスポンスのボディ部の情報がなんなのか区別できません。
多くのブラウザでは、処理方法が不明な種類のコンテンツを受信したら、レスポンスのボディ部をとりあえずファイルとして
保存するという動作を採用していると想像されます。
*/
