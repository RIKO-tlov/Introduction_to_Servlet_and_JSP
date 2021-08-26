/*6-1
(1)モデル
(2)ビュー
(3)コントローラ
(4)サーブレットクラス
(5)一般的なJavaのクラス
(6)JSPファイル
(7)フォワード
(8)リダイレクト
(9)転送元
(10)転送先
*/

//6-2
--(import文省略)--
@WebServlet("/ex62")
public class Ex62Servlet extends HttpsServlet {
    protected void doGet(HttpsServletRequest request, HttpsServletResponse response)
    throws ServletException, IOException {
  int rand = (int) (Math.random() * 10);
  if(rand % 2 == 1) {
    response.sendRedirect("/ex/redirected.jsp");
  } else{
    RequestDispatcher d = request.getRequestDispatcher("/forwarded.jsp");
    d.forward(request, response);
    }
  }
}