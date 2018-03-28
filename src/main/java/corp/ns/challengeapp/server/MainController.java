package corp.ns.challengeapp.server;

import corp.ns.challengeapp.server.requests.data.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final String SERVICE_MAIN_URL = "/challenge-app";

    @RequestMapping(SERVICE_MAIN_URL + "/auth_user_request")
    public UserInfo authUserRequest(@RequestParam("userId") int userId){
        UserInfo userInfo = new UserInfo(userId, "Lol");
        return userInfo;

    }

}
