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

	// 회원정보 수정 페이지로 이동
	@RequestMappint("/user/update.do")
	public String update() {
		logger.info("경로 : update");
		return "user/update"
	}

	// 회원정보 세션 삭제
	// 회원정보 삭제 페이지로 이동
	@RequestMappint("/user/delete.do")
	public String delete() {
		logger.info("경로 : delete");
		return "user/delete"
	}

	// 테스트
}