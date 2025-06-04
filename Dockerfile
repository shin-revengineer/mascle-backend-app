# ベースとなるLinux + OpenJDKの公式イメージ
FROM openjdk:21-slim

# 作業ディレクトリ作成
WORKDIR /app

# Javaファイルをコピー
COPY HelloWorld.java .

# コンパイル
RUN javac HelloWorld.java

# 実行コマンド
CMD ["java", "HelloWorld"]
