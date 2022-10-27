package starter.search;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.Collection;
import java.util.List;

public class SearchResult {
    public static Question<Collection<String>> titles() {
        //return actor -> TextContent.of(SearchResultList.RESULT_TITLES).viewedBy(actor).asList();
        return Text.ofEach(SearchResultList.RESULT_TITLES).describedAs("the results displayed");
    }
}
