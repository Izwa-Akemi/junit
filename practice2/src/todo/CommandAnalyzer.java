package todo;
/*ユーザのコマンド入力をチェックするクラス*/
public class CommandAnalyzer {

    public Command analyze(String text) {
        //テキストを半角スペースで区切る
        //1つ目の要素はコマンド名
        //2つ目の要素は引数
        //例外
        //add あいう えお

        String[] splittedText = text.split(" ", 2);

        if(splittedText.length > 1) {
            return new Command(splittedText[0], splittedText[1]);
        } else {
            return new Command(splittedText[0], "");
        }

    }

}
