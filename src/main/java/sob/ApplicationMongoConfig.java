package sob;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
class ApplicationMongoConfig extends AbstractMongoConfiguration {

  @Override
  protected String getDatabaseName() {
    return "sobDb";
  }

  @Override
  public MongoClient mongo() throws Exception {
    return new MongoClient();
  }

  @Override
  protected String getMappingBasePackage() {
    return "sob";
  }
}