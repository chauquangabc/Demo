import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        String s = " Lorem ipsum dolor sit amet consectetur adipisicing elit. Doloribus ut molestias ratione sunt qui quis. Ipsa voluptatum totam animi molestiae eos id quos iste quae earum consequuntur, inventore expedita excepturi?\r\n" + //
                        "    Nisi magnam voluptatum impedit temporibus delectus aut, ullam ut nemo dicta. Odio aliquam praesentium amet cumque nemo laborum dolor alias ipsa placeat reiciendis, aspernatur, ad iusto sunt qui eum. Eveniet!\r\n" + //
                        "    Libero alias voluptatem quo quis explicabo dolorem quam soluta eum quia vitae rerum omnis recusandae eaque ipsam fuga voluptate esse ad adipisci, corporis magnam tempora dolore. Asperiores tempora omnis delectus?\r\n" + //
                        "    Repellendus provident modi itaque mollitia suscipit quae, ad debitis maiores sapiente quo aperiam repudiandae cumque possimus esse aliquid et ducimus sed enim praesentium! Id illo tempore fugiat. Expedita, sequi et!\r\n" + //
                        "    Quis quidem alias maxime nostrum! Maxime, dicta! Distinctio tempora natus provident maxime cumque mollitia enim recusandae dolorem, quasi molestias quas vitae vero cum earum optio aliquam vel ratione laudantium delectus!\r\n" + //
                        "    Nemo repellendus aspernatur mollitia voluptatibus tempora quisquam quos ratione expedita molestiae. Ratione unde aliquid mollitia amet, atque vel magnam illum non. Nisi libero nulla vero porro numquam. Perspiciatis, eligendi modi!\r\n" + //
                        "    Vero, fuga. Aut optio eveniet quisquam, adipisci molestiae ullam ipsum accusantium minima illum cum eligendi officia at, ut est illo quis dicta veritatis. Nesciunt eaque modi itaque nostrum excepturi. Assumenda.\r\n" + //
                        "    Magni illum cum nobis earum dolor minus tempora optio qui in architecto. Aut recusandae dolorem vel, vero reprehenderit exercitationem quisquam aliquid non pariatur explicabo saepe aliquam fugit sapiente maiores dolorum?\r\n" + //
                        "    Quam incidunt debitis, corrupti architecto repellat dolorum eos nostrum aspernatur temporibus molestias cum inventore quis necessitatibus, illum amet quidem soluta voluptates aut modi sapiente consectetur! Saepe nobis distinctio incidunt. Explicabo.\r\n" + //
                        "    Quibusdam consequuntur odio temporibus sed optio eius modi ullam assumenda id corrupti, quod voluptates cum tenetur quo aliquam, vero inventore repellendus saepe expedita enim molestiae laudantium. Ab blanditiis nesciunt dolor.\r\n" + //
                        "    Voluptate blanditiis hic molestias molestiae atque corporis odio facilis quaerat aliquam. Voluptas pariatur, nobis neque eaque animi praesentium ipsam, vitae nulla cum molestias eveniet, ab quisquam ex. Accusamus, dolores optio!\r\n" + //
                        "    Porro tenetur id incidunt veritatis dolorem, suscipit voluptatum magnam qui corporis deserunt culpa iure sunt amet nam sed! Fuga eius autem ut minus quo provident cum earum quasi, dolorum eaque.\r\n" + //
                        "    Debitis eligendi unde facilis architecto nihil numquam, ipsum nam eveniet sed sunt aliquid autem explicabo recusandae aperiam quidem! Facere cum similique quibusdam? Eius, sint numquam? Voluptatibus harum labore quos odit!\r\n" + //
                        "    Eos officiis ex cupiditate consequuntur nemo dolor iusto in ullam quidem et itaque quis omnis saepe magnam consequatur qui eum quia natus aut unde, officia aliquam, soluta molestias corrupti. Id?\r\n" + //
                        "    Rerum, iure odio placeat aliquam, provident incidunt dolor fuga quasi tenetur vero totam enim fugit alias ipsum nihil voluptate consequatur iste corporis! Officia, dignissimos? Architecto exercitationem molestias eaque maiores ex."; 

                        String[] words = s.split(" ");
        
                        // Tạo một map để đếm số lần xuất hiện của mỗi từ
                        Map<String, Integer> wordCountMap = new HashMap<>();
                        
                        // Duyệt qua mảng từ và đếm số lần xuất hiện
                        for (String word : words) {
                            if (word.isEmpty()) {
                                continue;
                            }
                            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                        }
                        
                        // In ra các từ xuất hiện hơn 4 lần
                        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                            if (entry.getValue() > 4) {
                                System.out.println(entry.getKey() + ": " + entry.getValue());
                            }
                        }
    }
}
