package com.archer.amaterasuplus.mvp.repository;

import com.archer.amaterasuplus.domain.Notification;
import com.archer.amaterasuplus.domain.Post;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by archer on 07-01-17.
 */

public class NotificationRepository {
    public List<Notification> fetchNotifications () {
        List<Notification> notifications = new ArrayList<>();

        List<Post> posts1 = new ArrayList<>();
        List<Post> posts2 = new ArrayList<>();

        Notification notification1 = new Notification();
        notification1.setUrlImage("http://www.mosta2bal.com/vb/lyncache/3/21048wall.png");
        notification1.setName("Otaku For You");


        Notification notification2 = new Notification();
        notification2.setUrlImage("https://forums.animeuknews.net/data/avatars/l/0/249.jpg?1470515583");
        notification2.setName("Kyuubey Kurei-sama Kazama for you");

        Post post2 = new Post();
        post2.setAvatar("http://dl.glitter-graphics.com/pub/1354/1354901vs16tr9ob0.jpg");
        post2.setUsername("Rafael");
        post2.setCollection("Publica");
        post2.setTime("33 min");
        post2.setBody("Hey guys, can I get a shoutout? I'd really appreciate it. I can give one back as well ^^");
        post2.setUrlImage("http://images6.fanpop.com/image/answers/485000/485270_1372943261318_500_282.jpg");
        post2.setLikes(18);

        Post post3 = new Post();
        post3.setAvatar("https://forums.animeuknews.net/data/avatars/l/0/249.jpg?1470515583");
        post3.setUsername("frank romero");
        post3.setCollection("[Anime Ecchi Y Mas]");
        post3.setTime("1 h");
        post3.setBody("haapy  happy New Year");
        post3.setUrlImage("https://lh3.googleusercontent.com/-pF52knmR1oQ/VDBG91AUe4I/AAAAAAAAP0c/OCnPd7VWXh8/w426-h592/2014%2B-%2B1");
        post3.setLikes(27);

        posts1.add(post2);
        posts1.add(post3);

        posts2.add(post3);
        posts2.add(post2);
        posts2.add(post2);
        posts2.add(post3);
        posts2.add(post3);
        posts2.add(post3);

        notification1.setPublishBy(posts1);
        notification2.setPublishBy(posts2);

        notifications.add(notification1);
        notifications.add(notification2);

        return notifications;
    }
}
