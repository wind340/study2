//단어는 term:단어정의 def:단어뜻
var Word = /** @class */ (function () {
  function Word(term, def) {
    this.term = term;
    this.def = def;
  }
  Word.prototype.change = function (term) {
    this.term = term;
  };
  Word.prototype.output = function () {
    console.log("단어:" + this.term + "\n 뜻:" + this.def);
  };
  return Word;
})();
//단어 사전
var Dict = /** @class */ (function () {
  function Dict() {
    this.words = {};
  }
  Dict.prototype.create = function (word) {
    if (this.words[word.term] === undefined) {
      this.words[word.term] = word.def;
    }
  };
  Dict.prototype.read = function (term) {
    return this.words[term];
  };
  Dict.prototype.update = function (word) {
    if (this.words[word.term]) {
      this.words[word.term] = word.def;
    }
  };
  Dict.prototype.del = function (term) {
    return delete this.words[term];
  };
  return Dict;
})();
var dict = new Dict();
var kimchi = new Word("kimchi", "한국의 전통 음식");
var kimchi2 = new Word("kimchi", "한국의 전통 음식 ver.2");
dict.create(kimchi);
console.log("create : " + dict.read("kimchi"));
dict.update(kimchi2);
console.log("update : " + dict.read("kimchi"));
dict.del("kimchi");
console.log("delete : " + dict.read("kimchi"));
kimchi.change("kimchi2");
kimchi2.output();
