package com.kawastudio.scu06156235.scuproject.TestContent;

import java.util.ArrayList;
import java.util.List;

public class TestObject {

    /*
        https://ppt.cc/fLmLDx

        1. 早上起床之後 通常吃什麼當早點?

        。蛋和吐司----------3

        。麥片--------------1

        。汽水--------------6

        。什麼都不吃--------2

        2. 如果你可以選任何一樣你想吃的東西當早點你會選擇什麼?

        。蛋和吐司-------2

        。其它別種東西----1

        。汽水-----------3

        。蛋糕-----------4

        3. 午餐時?你會...

        。不吃東西 因為太忙或擔心體重---2

        。吃你想了一個早上想吃的東西----1

        。吃自己帶來的食物-------------3

        。問朋友要吃什麼 再一起去吃-----4

        4. 一位朋友請你吃一些她/他帶來的食物 你會...

        。吃一小口 因為實在太餓了-----------3

        。為了保持禮貌 只吃一小口-----------1

        。拒絕他/她的好意 因為你正在減肥-----2

        。吃兩口--------------------------6
        5. 你未來的男/女朋友請你吃一樣 東西 你想那會是什麼?

        。一塊蛋糕----------1

        。一顆蘋果----------2

        。一片批薩----------5

        。一個胡蘿蔔--------3

        6. 你的狗對你奮力搖尾巴 企圖引起你的注意 你會給他...

        。給他一塊狗餅乾-------------------3

        。一些蛋糕 ------------------------1

        。什麼都不給 拍拍他就好-------------4

        。什麼都不給 還把他趕開 因為你認為不能讓你的狗養成要什麼有什麼的壞習慣----2

        7. 夢中 你正在一家全世界最棒的餐廳裡 你想你會點...

        。菜單上列的每道菜 反正是做夢嘛!!---------2

        。一個大盤 裡面什麼東西都有的沙拉 --------1

        。牛排---------------------------------3

        。一個會讓你多長很多肥油的點心-----------4

        8. 在一個熱帶島上 你覺得什麼食物是你一定要吃到的?

        。水果和蔬蔡--------------------4

        。肉和馬玲薯--------------------3

        。冰淇淋 巧克力和蛋糕? ----------2

        。中國菜-----------------------5

        9. 你現在是一個嬰兒 你媽媽正在餵你吃...

        。嬰兒麥片或嬰兒食物-------------6

        。肉和馬鈴薯--------------------4

        。綠色花椰菜--------------------8

        。什麼都沒有 你媽正在做別的事------2

        10. 你現在是六歲的小孩 你爸爸正在餵你吃...

        。批薩---------7

        。義大利麵-----5

        。泡泡糖 ------1

        。胡蘿蔔-------3

     */


    private ArrayList<String> mQuestionList;
    private ArrayList<AnswerObject> mAnswerList;
    private ArrayList<String> mResultList;

    public TestObject() {
        initializeTest();
    }

    private void initializeTest() {

        //===========
        mQuestionList = new ArrayList<>();
        mQuestionList.add("1. 早上起床之後 通常吃什麼當早點?");
        mQuestionList.add("2. 如果你可以選任何一樣你想吃的東西當早點你會選擇什麼?");
        mQuestionList.add("3. 午餐時?你會...");
        mQuestionList.add("4. 一位朋友請你吃一些她/他帶來的食物 你會...");
        mQuestionList.add("5. 你未來的男/女朋友請你吃一樣 東西 你想那會是什麼?");
        mQuestionList.add("6. 你的狗對你奮力搖尾巴 企圖引起你的注意 你會給他...");
        mQuestionList.add("7. 夢中 你正在一家全世界最棒的餐廳裡 你想你會點...");
        mQuestionList.add("8. 在一個熱帶島上 你覺得什麼食物是你一定要吃到的?");
        mQuestionList.add("9. 你現在是一個嬰兒 你媽媽正在餵你吃...");
        mQuestionList.add("10. 你現在是六歲的小孩 你爸爸正在餵你吃...");
        //===========

        //===========
        mAnswerList = new ArrayList<>();

        ArrayList<String> answerList = new ArrayList<>();
        ArrayList<Integer> answerScoreList = new ArrayList<>();

        //1

        answerList.add("蛋和吐司");
        answerList.add("麥片");
        answerList.add("汽水");
        answerList.add("什麼都不吃");
        answerScoreList.add(3);
        answerScoreList.add(1);
        answerScoreList.add(6);
        answerScoreList.add(2);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));


        //2
        answerList.clear();
        answerScoreList.clear();

        answerList.add("蛋和吐司");
        answerList.add("其它別種東西");
        answerList.add("汽水");
        answerList.add("蛋糕");
        answerScoreList.add(2);
        answerScoreList.add(1);
        answerScoreList.add(3);
        answerScoreList.add(4);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));


        //3
        answerList.clear();
        answerScoreList.clear();

        answerList.add("心不吃東西 因為太忙或擔體重");
        answerList.add("吃你想了一個早上想吃的東西");
        answerList.add("吃自己帶來的食物");
        answerList.add("問朋友要吃什麼 再一起去吃");
        answerScoreList.add(2);
        answerScoreList.add(1);
        answerScoreList.add(3);
        answerScoreList.add(4);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));


        //4
        answerList.clear();
        answerScoreList.clear();

        answerList.add("吃一小口 因為實在太餓了");
        answerList.add("為了保持禮貌 只吃一小口");
        answerList.add("拒絕他/她的好意 因為你正在減肥");
        answerList.add("吃兩口");
        answerScoreList.add(3);
        answerScoreList.add(1);
        answerScoreList.add(2);
        answerScoreList.add(6);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));

        //5
        answerList.clear();
        answerScoreList.clear();

        answerList.add("一塊蛋糕");
        answerList.add("一顆蘋果");
        answerList.add("一片批薩");
        answerList.add("一個胡蘿蔔");
        answerScoreList.add(1);
        answerScoreList.add(2);
        answerScoreList.add(5);
        answerScoreList.add(3);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));

        //6
        answerList.clear();
        answerScoreList.clear();

        answerList.add("給他一塊狗餅乾");
        answerList.add("一些蛋糕");
        answerList.add("什麼都不給 拍拍他就好");
        answerList.add("什麼都不給 還把他趕開 因為你認為不能讓你的狗養成要什麼有什麼的壞習慣");
        answerScoreList.add(3);
        answerScoreList.add(1);
        answerScoreList.add(4);
        answerScoreList.add(2);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));

        //7
        answerList.clear();
        answerScoreList.clear();

        answerList.add("菜單上列的每道菜 反正是做夢嘛!!");
        answerList.add("一個大盤 裡面什麼東西都有的沙拉");
        answerList.add("牛排");
        answerList.add("一個會讓你多長很多肥油的點心");
        answerScoreList.add(2);
        answerScoreList.add(1);
        answerScoreList.add(3);
        answerScoreList.add(4);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));


        //8
        answerList.clear();
        answerScoreList.clear();

        answerList.add("水果和蔬蔡");
        answerList.add("肉和馬玲薯");
        answerList.add("冰淇淋 巧克力和蛋糕");
        answerList.add("中國菜");
        answerScoreList.add(4);
        answerScoreList.add(3);
        answerScoreList.add(2);
        answerScoreList.add(5);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));


        //9
        answerList.clear();
        answerScoreList.clear();

        answerList.add("嬰兒麥片或嬰兒食物");
        answerList.add("肉和馬玲薯");
        answerList.add("綠色花椰菜");
        answerList.add("什麼都沒有 你媽正在做別的事");
        answerScoreList.add(6);
        answerScoreList.add(4);
        answerScoreList.add(8);
        answerScoreList.add(2);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));


        //10
        answerList.clear();
        answerScoreList.clear();

        answerList.add("批薩");
        answerList.add("義大利麵");
        answerList.add("泡泡糖");
        answerList.add("胡蘿蔔");
        answerScoreList.add(7);
        answerScoreList.add(5);
        answerScoreList.add(1);
        answerScoreList.add(3);

        mAnswerList.add(new AnswerObject(answerList, answerScoreList));

        //===========

        mResultList = new ArrayList<>();
        mResultList.add("得分12-20:\n你是個害羞的人喔！當處在人多的場合時，你便會感到不自在。你常會覺得你的身心生得不是很一致或覺得你生錯了時代。你實際上比你看起來要聰明多了但是你不想讓別人知道這點。大概是屬於那種深藏不露的人。你有一顆可以容納很多想法的”心” 可是也因為你有太多想法，所以常你的思緒塞車。");
        mResultList.add("得分21-30:\n儘管生活是有崎嶇挫折，但你總有辦法克服，順利渡過！你遭遇過的挫折比一般人多。你曾經接觸過一些難相處的人、沒道理的規定和不和諧的人際關係。你對愛情的態度就像太陽表面一般熱情高溫。當你被很多煩人的事困擾的時候，你要不就是非常鎮定的靜觀其變要不就是以領導者的姿態出現叫大家都閉嘴。");
        mResultList.add("得分31-42:\n大致而言，你算是一個冷靜的人會讓你興奮的情況有：1.當你愛的樂團或歌手要來舉行演唱會。2.和情人約會。3.和朋友跳舞的時候。對你來說，朋友比什麼都重要。你愛好藝術和喜歡詩詞。你喜歡辦party或幫朋友一齊籌劃party。通常你身旁不缺追求的人，但你總是三不五時碰到一些呆板不解風情的人。你喜歡戶外活動，即使下雨天也影響不了你愛好戶外活動的精神。認識你的人都覺得你是一個，可依賴值得信賴的人。");
        mResultList.add("得分43-53:\n你有太多想法和計劃以致你總是覺得時間不夠用。如果你感到無聊你總是能夠想出辦法把場面炒熱。你是那種會讓人崇拜的人，你可以說是一個有能力讓”心想事成”的人。你通常不在乎別人的想法是個自我中心的人。你可以很自然的在大庭廣眾下親吻你的男/女朋友。”性”對你來說就像是一種充滿熱情的藝術品。即使有時候你也是一團糟，但你從不讓自己頹廢下去。");
    }

    public String getQuestion(int index) {
        if (index < mQuestionList.size()) {
            return mQuestionList.get(index);
        }
        return "";
    }

    public AnswerObject getAnswerObject(int index) {
        if (index < mAnswerList.size()) {
            return mAnswerList.get(index);
        }
        return null;
    }

    public int getTestCount() {
        return mQuestionList.size();
    }

    public String getResult(int score) {
        int index;
        if (score >= 12 && score <= 20) {
            index = 0;
        }
        else if (score >= 21 && score <= 30) {
            index = 1;
        }
        else if (score >= 31 && score <= 42) {
            index = 2;
        }
        else if (score >= 43 && score <= 53) {
            index = 3;
        }
        else {
            index = -1;
        }

        if (index == -1) {
            return "似乎程式哪編寫錯了哦！測驗結果秀不出來＠＠";
        }
        else {
            return mResultList.get(index);
        }
    }

}
