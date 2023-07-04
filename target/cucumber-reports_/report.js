$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login to website \"http://www.automationpractice.pl/index.php\"",
  "description": "  In order to login in \"http://www.automationpractice.pl/index.php\"\n  As a user\n  I want to use the functionalities of the website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfully login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "error_message": "io.cucumber.core.exception.CucumberException: Failed to instantiate class stepdefinitions.BaseTest\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:135)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.getInstance(ObjectFactoryServiceLoader.java:121)\r\n\tat io.cucumber.java.JavaHookDefinition.execute(JavaHookDefinition.java:61)\r\n\tat io.cucumber.core.runner.CoreHookDefinition.execute(CoreHookDefinition.java:31)\r\n\tat io.cucumber.core.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:20)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:47)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\r\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat io.cucumber.core.runtime.ObjectFactoryServiceLoader$DefaultJavaObjectFactory.cacheNewInstance(ObjectFactoryServiceLoader.java:129)\r\n\t... 35 more\r\nCaused by: org.openqa.selenium.remote.http.ConnectionFailedException: Unable to establish websocket connection to http://localhost:28341/devtools/browser/8f27bbad-dbb5-4ea6-87b9-de907ffd7acc\nBuild info: version: \u00274.1.0\u0027, revision: \u002787802e897b\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.31.40\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711\u0027\nDriver info: driver.version: ChromeDriver\r\n\tat org.openqa.selenium.remote.http.netty.NettyWebSocket.\u003cinit\u003e(NettyWebSocket.java:104)\r\n\tat org.openqa.selenium.remote.http.netty.NettyWebSocket.lambda$create$3(NettyWebSocket.java:137)\r\n\tat org.openqa.selenium.remote.http.netty.NettyClient.openSocket(NettyClient.java:116)\r\n\tat org.openqa.selenium.devtools.Connection.\u003cinit\u003e(Connection.java:77)\r\n\tat org.openqa.selenium.chromium.ChromiumDriver.lambda$new$2(ChromiumDriver.java:124)\r\n\tat java.base/java.util.Optional.map(Optional.java:265)\r\n\tat org.openqa.selenium.chromium.ChromiumDriver.\u003cinit\u003e(ChromiumDriver.java:122)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:104)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:91)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:46)\r\n\tat stepdefinitions.BrowserFactory.getBrowser(BrowserFactory.java:12)\r\n\tat stepdefinitions.BaseTest.\u003cinit\u003e(BaseTest.java:13)\r\n\t... 40 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "a user is on the \"http://www.automationpractice.pl/index.php\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.LoginSteps.aUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks \"Sign in\" from the menu",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LoginSteps.theUserClicksFromTheMenu(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user enters valid credentials",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LoginSteps.theUserEntersValidCredentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks \"Sign in\" button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.LoginSteps.theUserClicksButton(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is redirected to the \"Home\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.LoginSteps.theUserIsRedirectedToThePage(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
