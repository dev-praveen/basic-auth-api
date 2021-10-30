package com.secure.endpoints;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = MessageController.class)
class MessageControllerTest {

  @Autowired private MessageController messageController;

  @Test
  void sayIt() {

    final var text = messageController.sayIt("praveen");
    assertEquals("Hi praveen Good day!", text);
  }
}
