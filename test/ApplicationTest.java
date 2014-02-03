import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.Lettre;
/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    void assert_en_lettre(int d, String r) {
        assertThat(new Lettre(d).en_lettre()).isEqualTo(r);
    }

    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }

    @Test
    public void renderTemplate() {
        Content html = views.html.index.render("Your new application is ready.");
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("Your new application is ready.");
    }

    @Test
    public void lettre(){
        assert_en_lettre(1,"un");
        assert_en_lettre(2,"deux");
        assert_en_lettre(3,"trois");
        assert_en_lettre(4,"quatre");
        assert_en_lettre(5,"cinq");
        assert_en_lettre(6,"six");
        assert_en_lettre(7,"sept");
        assert_en_lettre(8,"huit");
        assert_en_lettre(9,"neuf");
        assert_en_lettre(10,"dix");
    }

}
