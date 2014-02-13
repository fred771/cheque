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

   /* void assert_en_lettre(int d, String r) {
        assertThat(new Lettre(d).en_lettre()).isEqualTo(r);
    }*/


    void assert_en_lettre_second(int d, String r) {
        assertThat(new Lettre(d).ZeroACent()).isEqualTo(r);
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
        /*assert_en_lettre(1,"un");
        assert_en_lettre(2,"deux");
        assert_en_lettre(3,"trois");
        assert_en_lettre(4,"quatre");
        assert_en_lettre(5,"cinq");
        assert_en_lettre(6,"six");
        assert_en_lettre(7,"sept");
        assert_en_lettre(8,"huit");
        assert_en_lettre(9,"neuf");
        assert_en_lettre(10,"dix");
        assert_en_lettre(11,"onze");
        assert_en_lettre(12,"douze");
        assert_en_lettre(13,"treize");
        assert_en_lettre(14,"quatorze");
        assert_en_lettre(15,"quinze");
        assert_en_lettre(16,"seize");
        assert_en_lettre(20,"vingt");
        assert_en_lettre(30,"trente");
        assert_en_lettre(40,"quarante");
        assert_en_lettre(50,"cinquante");
        assert_en_lettre(60,"soixante");
        assert_en_lettre(70,"soixante-dix");
        assert_en_lettre(80,"quatre-vingt");
        assert_en_lettre(90,"quatre-vingt-dix");
        assert_en_lettre(100,"cent");*/


        assert_en_lettre_second(10,"dix");
        assert_en_lettre_second(70,"soixante-dix");
        assert_en_lettre_second(90,"quatre-vingt-dix");
        assert_en_lettre_second(21,"vingt et un");
    }

}
