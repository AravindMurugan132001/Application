
import com.nseit.Application.response.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private APIResponse apiResponse;

    @PostMapping("/register")
    public ResponseEntity<APIResponse> register(@RequestBody AppUsers appUsers) {
        BookUser registeredUser = userService.registerAsCustomer(appUsers);

        apiResponse.setStatus(HttpStatus.CREATED.value());
        apiResponse.setData(registeredUser);
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<APIResponse> login(@RequestBody BookUser bookUser) {
        BookUser loggedInUser = userService.loginAsCustomer(bookUser);

        apiResponse.setStatus(HttpStatus.OK.value());
        apiResponse.setData(loggedInUser);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

}
