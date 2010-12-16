package com.jimplush.goose; /**
 * User: jim plush
 * Date: 12/16/10
 */

import org.apache.log4j.Logger;

/**
 * This class represents the extraction of an Article from a website
 *
 */
public class Article {

  private static final Logger logger = Logger.getLogger(Article.class);

  /**
   * Holds the title of the webpage
   */
  private String title;

  /**
   * returns the title of the webpage
   * @return
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
