package bacisAuthentication.auth;

import org.springframework.web.bind.annotation.*;

import static com.mike.AngularandSpringFullStack.Constants.CROSS_ORIGIN_URL;

@CrossOrigin(origins=CROSS_ORIGIN_URL)
@RestController
public class BasicAuthenticationController {

	@GetMapping("/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are authenticatited");
	}
}
