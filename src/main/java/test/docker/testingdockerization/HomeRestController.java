/**
 * @author jperezbenitez
 * @createdOn 11/14/2023 at 12:51 PM
 * @projectName testingDockerization
 * @packageName test.docker.testingdockerization;
 */
package test.docker.testingdockerization;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeRestController {

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello world";
    }

}
