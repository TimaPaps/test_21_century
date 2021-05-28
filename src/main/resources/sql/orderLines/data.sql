insert into order_lines (order_id, goods_id) values (1, 1), (1, 2), (1, 3), (1, 4),
                                                    (2, 4), (2, 3), (2, 2),
                                                    (3, 2), (3, 4),
                                                    (4, 2), (4, 1);

SELECT * from order_lines where order_id = 2;