package cronapi.watson.language_translator;

import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.*;
import cronapi.CronapiMetaData;

import java.util.Map;

@CronapiMetaData
public final class LanguageTranslatorOperations {

  @CronapiMetaData
  public static TranslationResult translate(String username, String password, String endPoint, Map<String, String> headers,
                                            TranslateOptions translateOptions) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.translate(translateOptions).execute();
  }

  @CronapiMetaData
  public static IdentifiedLanguages identify(String username, String password, String endPoint, Map<String, String> headers,
                                             IdentifyOptions identifyOptions) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.identify(identifyOptions).execute();
  }

  @CronapiMetaData
  public static IdentifiableLanguages listIdentifiableLanguages(String username, String password, String endPoint, Map<String, String> headers,
                                                                ListIdentifiableLanguagesOptions listIdentifiableLanguagesOptions) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listIdentifiableLanguages(listIdentifiableLanguagesOptions).execute();
  }

  @CronapiMetaData
  public static IdentifiableLanguages listIdentifiableLanguages(String username, String password, String endPoint, Map<String, String> headers) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listIdentifiableLanguages().execute();
  }

  @CronapiMetaData
  public static TranslationModel createModel(String username, String password, String endPoint, Map<String, String> headers,
                                             CreateModelOptions createModelOptions) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createModel(createModelOptions).execute();
  }

  @CronapiMetaData
  public static void deleteModel(String username, String password, String endPoint, Map<String, String> headers,
                                 DeleteModelOptions deleteModelOptions) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteModel(deleteModelOptions).execute();
  }

  @CronapiMetaData
  public static TranslationModel getModel(String username, String password, String endPoint, Map<String, String> headers,
                                          GetModelOptions getModelOptions) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getModel(getModelOptions).execute();
  }

  @CronapiMetaData
  public static TranslationModels listModels(String username, String password, String endPoint, Map<String, String> headers,
                                             ListModelsOptions listModelsOptions) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listModels(listModelsOptions).execute();
  }

  @CronapiMetaData
  public static TranslationModels listModels(String username, String password, String endPoint, Map<String, String> headers) {
    LanguageTranslator service = new LanguageTranslator();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.listModels().execute();
  }
}
