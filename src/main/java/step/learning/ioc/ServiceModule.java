package step.learning.ioc;

import com.google.inject.AbstractModule;
import step.learning.services.db.DbService;
import step.learning.services.db.MySqlDbService;
import step.learning.services.form.FormParseService;
import step.learning.services.form.HybridFormParser;
import step.learning.services.hash.HashService;
import step.learning.services.hash.Md5HashService;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        // конфігурація служб
        // "Буде запит на HashService -- повернути об'єкт Md5HashService"
        bind(HashService.class).to(Md5HashService.class);  // ASP: Service.AddSingleton<Hash,Md5>
        bind(DbService.class).to(MySqlDbService.class);
        bind(FormParseService.class).to(HybridFormParser.class);
    }
}
