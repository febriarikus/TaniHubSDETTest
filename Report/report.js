$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TaniHub.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "As a User\nI want to search specific product\nSo that I get the detail of product",
  "id": "search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 525570,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "search specific product",
  "description": "",
  "id": "search;search-specific-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "on tanihub homescreen",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I select area jabodetabek",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I search product : Rose Brand Minyak Goreng 2 L Karton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I get the detail of Rose Brand Minyak Goreng 2 L Karton",
  "keyword": "Then "
});
formatter.match({
  "location": "TaniHub.givenOnTaniHubHomeScreen()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 38096781720,
  "status": "passed"
});
formatter.match({
  "location": "TaniHub.whenSelectAreaJabodetabek()"
});
formatter.embedding("image/png", "embedded1.png");
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 4918556524,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rose Brand Minyak Goreng 2 L Karton",
      "offset": 19
    }
  ],
  "location": "TaniHub.whenSearchProduct(String)"
});
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 33024292276,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rose Brand Minyak Goreng 2 L Karton",
      "offset": 20
    }
  ],
  "location": "TaniHub.thenGetTheDetailOfProduct(String)"
});
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 3596137017,
  "status": "passed"
});
});