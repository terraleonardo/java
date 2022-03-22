class Book { //implementação da classe

    //atributos
    String title;
    int numPages;
    int readPages;

    Book(String title, int pages) {
        this.title = title;
        this.numPages = pages;
        this.readPages = 0;
    }

    String getTitle() {
        return this.title;
    }
    int getPages() {
        return this.numPages;
    }
    int getReadPages() {
        return this.readPages;
    }

    void read(int num) {
        if((this.readPages + num) < this.numPages) {
            this.readPages += num;
            System.out.println("current page: "+this.readPages+"/"+this.numPages);
        }
        else {
            this.readPages = this.numPages;
            System.out.println("you finished the book!");
        }
    }

    void restart() {
        if(this.readPages > 0) this.readPages = 0;
    }


}
