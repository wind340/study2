const quotes = [
    {
        quote: " 나 자신에 대한 자신감을 잃으면 온 세상이 나의 적이 된다.",
        author: "랄프 왈도 에머슨",
    },
    {
        quote: " 항상 맑으면 사막이 된다.비가 내리고 바람이 불어야만 비옥한 땅이 된다.",
        author: "스페인 속담",
    },
    {
        quote: "삶이 있는 한 희망은 있다",
        author: "키케로",
    },
    {
        quote: "산다는것 그것은 치열한 전투이다",
        author: "로망로랑",
    },
    {
        quote: "1퍼센트의 가능성, 그것이 나의 길이다",
        author: "나폴레옹",
    },
    {
        quote: "만약 우리가 할 수 있는 일을 모두 한다면 우리들은 우리자신에 깜짝 놀랄 것이다",
        author: "에디슨",
    },
    {
        quote: "눈물과 더불어 빵을 먹어 보지 않은 자는 인생의 참다운 맛을 모른다",
        author: "괴테",
    },
    {
        quote: "이미끝나버린 일을 후회하기 보다는 하고 싶었던 일들을 하지못한 것을 후회하라.",
        author: "탈무드",
    },
    {
        quote: "도중에 포기하지 말라. 망설이지 말라. 최후의 성공을 거둘 때까지 밀고 나가자",
        author: "헨리포드",
    },
    {
        quote: "삶을 사는 데는 단 두가지 방법이 있다. 하나는 기적이 전혀 없다고 여기는 것이고 또 다른 하나는 모든 것이 기적이라고 여기는방식이다",
        author: "알베르트 아인슈타인",
    }

]


const quote = document.querySelector("#quote span:first-child");
const author = document.querySelector("#quote span:last-child");

const todaysQuote = quotes[Math.floor(Math.random() * quotes.length)];

quote.innerText = todaysQuote.quote;
author.innerText = todaysQuote.author;