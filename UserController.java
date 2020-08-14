@controller
public class UserController {

	// 로그인 페이지로이동
	@RequestMappint("/user/login.do")
	public String login() {
		logger.info("경로 : login");
		return "user/login"
	}

	// insert로 이동
	@RequestMappint("/user/insert.do")
	public String insert() {
		logger.info("경로 : insert");
		return "user/insert"
	}
}