//단어사전 만들기
//단어들의 타입 정의
type WordsType = {
  [key: string]: string;
};

//단어는 term:단어정의 def:단어뜻
class Word {
  constructor(public term: string, public def: string) {}

  change(term: string) {
    this.term = term;
  }

  output() {
    console.log("단어:" + this.term + "\n 뜻:" + this.def);
  }
}

//단어 사전
class Dict {
  private words: WordsType;
  constructor() {
    this.words = {};
  }

  create(word: Word) {
    if (this.words[word.term] === undefined) {
      this.words[word.term] = word.def;
    }
  }

  read(term: string) {
    return this.words[term];
  }

  update(word: Word) {
    if (this.words[word.term]) {
      this.words[word.term] = word.def;
    }
  }

  del(term: string) {
    return delete this.words[term];
  }
}

const dict = new Dict();
const kimchi = new Word("kimchi", "한국의 전통 음식");
const kimchi2 = new Word("kimchi", "한국의 전통 음식 ver.2");

dict.create(kimchi);
console.log("create : " + dict.read("kimchi"));

dict.update(kimchi2);
console.log("update : " + dict.read("kimchi"));

dict.del("kimchi");
console.log("delete : " + dict.read("kimchi"));

kimchi.change("kimchi2");
kimchi2.output();
