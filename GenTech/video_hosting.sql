CREATE TABLE `user` (
  `user_id` int PRIMARY KEY,
  `username` varchar(32),
  `email` varchar(32),
  `password` varchar(32_),
  `registration_date` timestamp,
  `avatar_url` varchar(256),
  `bio` text,
  `country` varchar(32),
  `is_blocked` bool
);

CREATE TABLE `video` (
  `video_id` int PRIMARY KEY,
  `user_id` int,
  `title` varchar(256),
  `description` text,
  `upload_date` timestamp,
  `views` int,
  `thumbnail_url` varchar(256),
  `video_url` varchar(256),
  `duration` int,
  `is_blocked` bool
);

CREATE TABLE `comment` (
  `comment_id` int PRIMARY KEY,
  `video_id` int,
  `user_id` int,
  `comment_text` text,
  `comment_date` timestamp,
  `parent_comment_id` int,
  `is_deleted` bool
);

CREATE TABLE `like` (
  `like_id` int PRIMARY KEY,
  `user_id` int,
  `video_id` int,
  `liked_date` timestamp,
  `is_deleted` bool
);

CREATE TABLE `tag` (
  `tag_id` int PRIMARY KEY,
  `tag_name` varchar(64),
  `is_deleted` bool
);

CREATE TABLE `video_tag` (
  `video_tag_id` int PRIMARY KEY,
  `video_id` int,
  `tag_id` int,
  `is_deleted` bool
);

CREATE TABLE `subscription` (
  `subscription_id` int PRIMARY KEY,
  `subscriber_id` int,
  `channel_id` int
);

CREATE TABLE `notification` (
  `notification_id` int PRIMARY KEY,
  `user_id` int,
  `notification_text` text,
  `notification_date` timestamp,
  `is_read` bool
);

CREATE TABLE `playlist` (
  `playlist_id` int PRIMARY KEY,
  `user_id` int,
  `playlist_name` varchar(64),
  `created_date` timestamp
);

CREATE TABLE `playlist_videos` (
  `playlist_video_id` int PRIMARY KEY,
  `playlist_id` int,
  `video_id` int,
  `added_date` timestamp
);

ALTER TABLE `video` ADD FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

ALTER TABLE `comment` ADD FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`);

ALTER TABLE `comment` ADD FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

ALTER TABLE `like` ADD FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`);

ALTER TABLE `like` ADD FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

CREATE TABLE `tag_video_tag` (
  `tag_tag_id` int,
  `video_tag_tag_id` int,
  PRIMARY KEY (`tag_tag_id`, `video_tag_tag_id`)
);

ALTER TABLE `tag_video_tag` ADD FOREIGN KEY (`tag_tag_id`) REFERENCES `tag` (`tag_id`);

ALTER TABLE `tag_video_tag` ADD FOREIGN KEY (`video_tag_tag_id`) REFERENCES `video_tag` (`tag_id`);


ALTER TABLE `video_tag` ADD FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`);

CREATE TABLE `user_subscription` (
  `user_user_id` int,
  `subscription_subscriber_id` int,
  PRIMARY KEY (`user_user_id`, `subscription_subscriber_id`)
);

ALTER TABLE `user_subscription` ADD FOREIGN KEY (`user_user_id`) REFERENCES `user` (`user_id`);

ALTER TABLE `user_subscription` ADD FOREIGN KEY (`subscription_subscriber_id`) REFERENCES `subscription` (`subscriber_id`);


CREATE TABLE `user_subscription(1)` (
  `user_user_id` int,
  `subscription_channel_id` int,
  PRIMARY KEY (`user_user_id`, `subscription_channel_id`)
);

ALTER TABLE `user_subscription(1)` ADD FOREIGN KEY (`user_user_id`) REFERENCES `user` (`user_id`);

ALTER TABLE `user_subscription(1)` ADD FOREIGN KEY (`subscription_channel_id`) REFERENCES `subscription` (`channel_id`);


ALTER TABLE `notification` ADD FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

ALTER TABLE `playlist` ADD FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

CREATE TABLE `playlist_playlist_videos` (
  `playlist_playlist_id` int,
  `playlist_videos_playlist_id` int,
  PRIMARY KEY (`playlist_playlist_id`, `playlist_videos_playlist_id`)
);

ALTER TABLE `playlist_playlist_videos` ADD FOREIGN KEY (`playlist_playlist_id`) REFERENCES `playlist` (`playlist_id`);

ALTER TABLE `playlist_playlist_videos` ADD FOREIGN KEY (`playlist_videos_playlist_id`) REFERENCES `playlist_videos` (`playlist_id`);


ALTER TABLE `playlist_videos` ADD FOREIGN KEY (`video_id`) REFERENCES `video` (`video_id`);
