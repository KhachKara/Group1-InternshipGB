package gb.internship.RESTSimpleStub;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Простой REST контроллер.
 *
 * @author Aleksandr Vvedensky
 */
@RestController
public class RequestController {

    public static final String DEFAULT_RESPONCE = "You see default string. <br> " +
            "Use: http://localhost:8080/echo?echoString=myString" +
            "<br>to see your string.";

    /**
     * Обслуживает это-запросы.
     *
     * @param echoString строка аргумент из запроса.
     * @return полученный echoString или значение по умолчанию.
     */
    @RequestMapping("/echo")
    public String echo(
            @RequestParam(value = "echoString", defaultValue = DEFAULT_RESPONCE) String echoString) {
        return echoString;
    }
}
