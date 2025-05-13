import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class SwiperApplication {

    @Controller
    public class HomeController {
        @GetMapping("/index")
        public String home() {
            return "index/index";
        }
    }
}
