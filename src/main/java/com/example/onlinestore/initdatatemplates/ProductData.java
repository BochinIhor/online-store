package com.example.onlinestore.initdatatemplates;

import com.example.onlinestore.entity.Product;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class ProductData {
    //private static final Logger logger = LoggerFactory.getLogger(ProductData.class);
    public Product[] productsReference = new Product[16];
    Product product = new Product();
    String imgUrl;

    public Product[] getItems() {
        /*1*/
        product.setName("Acer Aspire 7");
        product.setFullName("Acer Aspire 7 A715-42G-R3EZ (NH.QBFEU.00C) Charcoal Black / AMD Ryzen 5 5500U / RAM 16 ГБ / SSD 512 ГБ / nVidia GeForce GTX 1650");
        product.setCategory("Laptop");
        product.setPrice(30999);
        product.setDescription("Aspire 7 – компактний ноутбук із якісним дисплеєм Full HD IPS і великим набором інтерфейсів. Завдяки продуктивному залізу ноутбук чудово впорається з найвимогливішими завданнями, а також підійде для сучасних ігор.");
        imgUrl = "https://content1.rozetka.com.ua/goods/images/big/290842123.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/175333148.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/175333153.jpg";
        product.setImageUrls(imgUrl);
        productsReference[0] = product;
        product = new Product();
        /*2*/
        product.setName("ASUS TUF Gaming A15");
        product.setFullName("ASUS TUF Gaming A15 FA506ICB-HN119 (90NR0667-M00KT0) Graphite Black / AMD Ryzen 5 4600H / RAM 16 ГБ / SSD 512 ГБ / nVidia GeForce RTX 3050");
        product.setCategory("Laptop");
        product.setPrice(35999);
        product.setDescription("Ноутбук має збалансовану конфігурацію, яка чудово підходить для продуктивної роботи, зокрема в багатозадачному режимі. Високу продуктивність у популярних іграх і VR-застосунках гарантують новітній процесор AMD і дискретна відеокарта nVidia. Їх доповнює твердотілий накопичувач, який забезпечує швидке завантаження програм і пропонує достатньо простору для зберігання великої колекції ігор і портфоліо професійних робіт.");
        imgUrl = "https://content1.rozetka.com.ua/goods/images/big/302686477.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/302686482.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/302686479.jpg";
        product.setImageUrls(imgUrl);
        productsReference[1] = product;
        product = new Product();
        /*3*/
        product.setName("Lenovo IdeaPad 3 15ALC6");
        product.setFullName("Lenovo IdeaPad 3 15ALC6 (82KU01C4RA) Arctic Grey / AMD Ryzen 5 5500U / RAM 16 ГБ / SSD 512 ГБ");
        product.setCategory("Laptop");
        product.setPrice(24899);
        product.setDescription("Lenovo Ideapad 3 — це найкращий ноутбук для навчання з дому та за його межами. Він поєднує високу потужність мобільних процесорів AMD Ryzen серії 5000 з відеокартою Radeon та розумні рішення для роботи та навчання, які допомагають зменшити навантаження на очі, біль, пов’язаний з неправильною поставою, та відволікаючі фактори. Пристрій оснащений інтелектуальною системою охолодження та шторкою вебкамери, яка гарантує конфіденційність користувача.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/280562759.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/280562850.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/280562786.jpg";
        product.setImageUrls(imgUrl);
        productsReference[2] = product;
        product = new Product();
        /*4*/
        product.setName("ARTLINE Gaming X47");
        product.setFullName("ARTLINE Gaming X47 (X47v45) AMD Ryzen 5 5500 / 16ГБ DDR4 / HDD 1ТБ + SSD 480ГБ / nVidia GeForce RTX 3060 12 ГБ");
        product.setCategory("PC");
        product.setPrice(34899);
        product.setDescription("ARTLINE Gaming - це ігрові персональні комп'ютери, які покликані бути розважальним центром для будь-якого користувача. Під час створення моделей проводиться ретельний підбір, оцінка можливостей і сумісність кожного компонента. Завдяки різноманітності серії Gaming кожен зможе підібрати собі модель виходячи з особистих переваг.\n" +
                "\n" +
                "Ігровий ПК ARTLINE Gaming X47v45 побудований на платформі материнської плати ASRock A320M-DVS з роз'ємом AM4 та підтримкою процесорів AMD всіх поколінь Ryzen. Має технологію ASRock Full Spike Protection, яка охоплює цілу низку інженерних рішень для захисту від електричних навантажень, корозії та інших проблем. А також набір усіх сучасних інтерфейсів та портів (USB 3.1 Gen1, гігабітний Ethernet) та багато іншого.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/320078659.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/282627167.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/282627175.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/282627189.jpg";
        product.setImageUrls(imgUrl);
        productsReference[3] = product;
        product = new Product();
        /*5*/
        product.setName("Artline Gaming (X43v31)");
        product.setFullName("Artline Gaming (X43v31) AMD Ryzen 5 3600 / Gigabyte B450M S2H / 16ГБ DDR4 / MSI GeForce RTX 3050 AERO 8G OC / SSD 480ГБ + HDD 1ТБ / 600W GPS-600A");
        product.setCategory("PC");
        product.setPrice(27499);
        product.setDescription("ARTLINE Gaming — це ігрові персональні комп'ютери, які покликані бути розважальним центром для будь-якого користувача. Під час створення моделей проводиться ретельний підбір, оцінка можливостей і сумісність кожного компонента. Завдяки різноманітності серії Gaming кожен зможе підібрати собі модель виходячи з особистих переваг.\n" +
                "\n" +
                "Ігровий ПК ARTLINE Gaming X43v31 побудований на платформі материнської плати Gigabyte B450M S2H з роз'ємом AM4 та підтримкою процесорів AMD усіх поколінь Ryzen. Має технології, яка охоплють цілу низку інженерних рішень для захисту від електричних навантажень, корозії та інших проблем. А також набір усіх сучасних інтерфейсів та портів (USB 3.1 Gen1, гігабітний Ethernet) та багато іншого.");
        imgUrl = "https://content1.rozetka.com.ua/goods/images/big/317212965.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/277930782.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/277930783.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/277930765.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/277930785.jpg";
        product.setImageUrls(imgUrl);
        productsReference[4] = product;
        product = new Product();
        /*6*/
        product.setName("ARTLINE Overlord H1 v30");
        product.setFullName("ARTLINE Overlord H1 v30 (H1v30) Mini-ITX / AMD Ryzen 5 5500 / NZXT WaterCooler 140 mm / 16ГБ DDR4-3200 / NVME SSD 1ТБ / nVidia GeForce RTX 3060 Ti 8 ГБ / 650W 80Plus Gold");
        product.setCategory("PC");
        product.setPrice(39999);
        product.setDescription("ARTLINE Overlord – це ігрові персональні комп'ютери, чиє покликання бути розважальним центром для будь-якого користувача. Під час створення моделей проводиться ретельний підбір, оцінка можливостей і сумісність кожного компонента. Завдяки різноманітності серії Overlord кожен зможе підібрати собі модель виходячи з особистих уподобань.\n" +
                "\n" +
                "Ігровий ПК ARTLINE Overlord H1v30 побудований на платформі материнської плати ASUS PRIME A320I-K. Вона оснащена роз'ємом AM4 та призначена для встановлення процесорів AMD Ryzen та Athlon. Для підключення периферійних пристроїв та накопичувачів є широкий набір інтерфейсів: PCIe 3.0, M.2, Realtek RTL8111H 1 Гбіт/с Ethernet, USB 3.2 Gen1.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/299560037.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/299560031.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/299560034.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/299560015.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/299560002.jpg";
        product.setImageUrls(imgUrl);
        productsReference[5] = product;
        product = new Product();
        /*7*/
        product.setName("28\" Samsung Odyssey G7 S28AG702");
        product.setFullName("28\" Samsung Odyssey G7 S28AG702 (LS28AG702NIXCI) 4K HDR400 / IPS 8-Bit / 144Гц / sRGB 99% / G-SYNC Compatible");
        product.setCategory("Monitor");
        product.setPrice(20999);
        product.setDescription("Роздільна здатність UHD, IPS-панель і стандарт HDR400 поєднуються для відображення ефектних кольорів із цілковитою глибиною та неймовірною деталізацією.\n" +
                "\n" +
                "Частота оновлення 144 Гц, час відгуку 1 мс і сумісність із технологією G-Sync підіймають вас на найвищий рівень гри.");
        imgUrl = "https://content1.rozetka.com.ua/goods/images/big/250044076.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/250044127.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/250044109.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/250044106.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/250044088.jpg";
        product.setImageUrls(imgUrl);
        productsReference[6] = product;
        product = new Product();
        /*8*/
        product.setName("27\" Asus TUF Gaming VG27AQ");
        product.setFullName("27\" Asus TUF Gaming VG27AQ (90LM0500-B01370 / B03370) -- IPS 2K / 165 Гц / 8-Bit / 99% sRGB / G-Sync Сompatible / Adaptive-Sync / HDR10");
        product.setCategory("Monitor");
        product.setPrice(12799);
        product.setDescription("TUF Gaming VG27AQ — це 27-дюймовий WQHD (2560x1440) HDR IPS-дисплей із надшвидкою частотою 165 Гц, розроблений для професійних геймерів і тих, хто шукає захопливий ігровий процес.\n" +
                "Уперше на будь-якому ігровому моніторі одночасно можуть бути ввімкнені Motion Blur Reduction і Adaptive-sync. Ця нова технологія називається Asus Extreme Low Motion Blur Sync (ELMB SYNC). ELMB SYNC працює з G-SYNC, сумісним, що дає змогу геймерам насолоджуватися різкими, високошвидкісними кадрами.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/18307112.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/18307351.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/18307378.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/18307148.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/18307074.jpg";
        product.setImageUrls(imgUrl);
        productsReference[7] = product;
        product = new Product();
        /*9*/
        product.setName("23.8\" AOC 24G2SAE/BK");
        product.setFullName("23.8\" AOC 24G2SAE/BK - 165 Hz / Adaptive Sync / G-SYNC Compatible (DisplayPort) / Freesync Premium / DisplayHDR 400 / Speaker");
        product.setCategory("Monitor");
        product.setPrice(8999);
        product.setDescription("Монітор 24G2SAE/BK підійде всім, хто прагне високої продуктивності. Він має роздільну здатність 1080p Full High Definition (FHD), низьку затримку введення і широку колірну гамму, підтримку FreeSync Premium і оснащений класичною підставкою, що нахиляється.\n" +
                "\n" +
                "Розширте поле огляду з кількома моніторами. Вузькі межі та безрамна конструкція забезпечує мінімум рамок для неперевершеного бойового посту.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/300747657.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/241666427.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/241666426.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/241666423.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/241666425.jpg";
        product.setImageUrls(imgUrl);
        productsReference[8] = product;
        product = new Product();
        /*10*/
        product.setName("Миша Razer DeathAdder Essential USB Black");
        product.setFullName("Миша Razer DeathAdder Essential USB Black (RZ01-03850100-R3M1)");
        product.setCategory("keyboards-mice");
        product.setPrice(1499);
        product.setDescription("Вже більше десяти років серія Razer DeathAdder є основною на світовий кіберспортивній арені. Вона завоювала репутацію надійності, якій довіряють геймери, завдяки своїй перевіреній довговічності і ергономіці. Тепер її зробили ще більш доступною, зустрічайте новинку - Razer DeathAdder Essential.\n" +
                "\n" +
                "Ефективність, перевірена часом\n" +
                "Серія Razer DeathAdder - одна з найвідоміших і визнаних ігрових мишей в світі. Більше 9 мільйонів проданих одиниць по всьому світу і десятки іменитих нагород, не дивно, що Razer DeathAdder стала культовою з моменту своєї появи. Ознайомтеся з її головними віхами нижче.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/12934233.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/12934309.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/12934273.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/12934326.jpg";
        product.setImageUrls(imgUrl);
        productsReference[9] = product;
        product = new Product();
        /*11*/
        product.setName("Миша Logitech G102 Lightsync USB Blue");
        product.setFullName("Миша Logitech G102 Lightsync USB Blue (910-005801)");
        product.setCategory("keyboards-mice");
        product.setPrice(1299);
        product.setDescription("Оцініть високу точність переміщення і чудову чутливість курсору, які забезпечує датчик ігрового класу. Використовуючи функцію настройки чутливості, можна задати необхідний рівень в межах від 200 до 8000 точок на дюйм. ПЗ Logitech G HUB дозволяє створити до 5 режимів, які можно зберегти у пам'яті пристрою.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/246091335.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/31498688.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/31498677.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/31498704.jpg";
        product.setImageUrls(imgUrl);
        productsReference[10] = product;
        product = new Product();
        /*12*/
        product.setName("Клавіатура дротова HATOR Rockfall EVO Black");
        product.setFullName("Клавіатура дротова HATOR Rockfall EVO Black TKL Kailh Optical (HTK-630)");
        product.setCategory("keyboards-mice");
        product.setPrice(2799);
        product.setDescription("HATOR Rockfall EVO TKL – надшвидка оптична ігрова клавіатура. Максимум лаконічності та ефективності: ця клавіатура залишить вам більше вільного місця на робочому столі без втрати продуктивності.\n" +
                "\n" +
                "ОПТИЧНІ ПЕРЕМИКАЧІ KAILH OPTICAL BLACK ГАРАНТУЮТЬ НЕЙМОВІРНУ ШВИДКІСТЬ СПРАЦЬОВУВАННЯ В 0,2 МІЛІСЕКУНДИ І МАЮТЬ РЕСУРС В 80 МЛН. НАТИСКАНЬ.");
        imgUrl = "https://content1.rozetka.com.ua/goods/images/big/317301993.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/317301994.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/317301995.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/317301996.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/317301997.jpg";
        product.setImageUrls(imgUrl);
        productsReference[11] = product;
        product = new Product();
        /*13*/
        product.setName("Клавіатура дротова Hator Starfall Outemu Red");
        product.setFullName("Клавіатура дротова Hator Starfall Outemu Red (HTK-608)");
        product.setCategory("keyboards-mice");
        product.setPrice(1459);
        product.setDescription("Механічна клавіатура — більше не розкіш! Надійні й ефективні механічні перемикачі, яскрава підсвітка й доступна вартість — у Hator Starfall органічно поєднані всі якості сучасної ігрової клавіатури.\n" +
                "\n" +
                "МЕХАНІЧНІ ПЕРЕМИКАЧІ OUTEMU ЗАБЕЗПЕЧУЮТЬ ШВИДКІСТЬ СПРАЦЬОВУВАННЯ Й НАДІЙНІСТЬ У ВИКОРИСТАННІ, ЗАВДЯКИ РЕСУРСУ НАПРАЦЮВАННЯ НА 50 МЛН НАТИСКАНЬ.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/123147308.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/202761485.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/166474046.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/166474051.jpg";
        product.setImageUrls(imgUrl);
        productsReference[12] = product;
        product = new Product();
        /*14*/
        product.setName("Навушники Hator Hypergang PC Edition Black");
        product.setFullName("Навушники Hator Hypergang PC Edition Black (HTA-805)");
        product.setCategory("accessory");
        product.setPrice(1699);
        product.setDescription("Hypergang PC Edition призначена для стаціонарного використання з ПК. Якість звучання та чудовий мікрофон, властивий серії гарнітур Hypergang, повною мірою властиві і цій моделі. Легка та міцна конструкція з металу забезпечує надійність та комфорт використання гарнітури. 53-мм динаміки з композитною мембраною відповідають за точний та насичений звук. Ви завжди знатимете, де знаходиться ваш супротивник.\n" +
                "\n" +
                "Знімний високочутливий мікрофон з відмінним рівнем передачі голосу чудово підійде як для ігор, там і для стрімінгу. Ергономічні амбушюри із надійної протеїнової шкіри з наповнювачем із піни з ефектом пам'яті. Кабель у щільному обплетенні призначений для підключення до ПК. Він оснащений компактним пультом керування, що дозволяє регулювати гучність навушників та своєчасно вмикати/вимикати мікрофон.");
        imgUrl = "https://content2.rozetka.com.ua/goods/images/big/314505543.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/314505544.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/314505545.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/316742190.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/316742191.jpg";
        product.setImageUrls(imgUrl);
        productsReference[13] = product;
        product = new Product();
        /*15*/
        product.setName("Гарнітура Razer Blackshark V2 X USB Black");
        product.setFullName("Гарнітура Razer Blackshark V2 X USB Black (RZ04-04570100-R3M1)");
        product.setCategory("accessory");
        product.setPrice(2799);
        product.setDescription("Бийтеся з ворогами в легкій кіберспортівній гарнітурі, що розкриває свої переваги у напружених баталіях. Представляємо Razer BlackShark V2 X — потрійну загрозу: дивовижне звучання, чудової чистоти мікрофон та звукоізоляція високої якості, підтверджені про-гравцями.\n" +
                "\n" +
                "З можливістю індивідуальної передачі високих, середніх та низьких частот, новий запатентований дизайн динаміків від Razer працює як 3 в 1 — це яскраве звучання з багатими високими частотами та потужними басами, чіткою та ясною передачею голосу.\n" +
                "\n" +
                "Покращена передача голосу та зниження шуму. Гнучкий мікрофон на цій легкій кіберспортівній гарнітурі має оптимізований корпус з більш відкритою конструкцією для мінімальних перешкод, що забезпечує підвищену чіткість для більш ясного звучання вашого голосу.\n" +
                "\n" +
                "Вимкніть сторонні звуки та насолоджуйтеся безперервною зосередженістю з закритими навушниками, які повністю закривають ваші вуха завдяки м'яким амбушурам, що створюють ідеальне ущільнення для більшої звукоізоляції.");
        imgUrl = "https://content1.rozetka.com.ua/goods/images/big/299243723.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/299243725.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/299243728.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/299243731.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/299243732.jpg";
        product.setImageUrls(imgUrl);
        productsReference[14] = product;
        product = new Product();
        /*16*/
        product.setName("Навушники Razer Opus X Green");
        product.setFullName("Навушники Razer Opus X Green (RZ04-03760400-R3M1)");
        product.setCategory("accessory");
        product.setPrice(3999);
        product.setDescription("Повністю пориньте в гру або музику з Razer Opus X — елегантною бездротовою Bluetooth-гарнітурою з налаштованими 40-мм динаміками та мікрофоном. Увімкніть активне шумозаглушення ANC і насолоджуйтеся звуком без відволікальних чинників. Знищуйте суперників в ігровому режимі з низькою затримкою.\n" +
                "\n" +
                "Усуньте всі відволікальні чинники за допомогою технології активного шумозаглушення, яка виявляє та усуває небажані довколишні шуми під час прослуховування улюблених треків, перегляду фільму або гри.\n" +
                "\n" +
                "Bluetooth 5.0 з вищою пропускною здатністю, більшим радіусом дії та меншим енергоспоживанням забезпечує надійне бездротове з'єднання, яке є енергоефективним та продовжує термін експлуатації батареї.\n" +
                "\n" +
                "Увімкніть ігровий режим, щоб активувати бездротовий зв'язок гарнітури під час ігор або перегляду відео на Bluetooth — пристроях для зручнішої роботи.\n" +
                "\n" +
                "Opus X, обладнаний спеціально налаштованими 40-міліметровими динаміками, забезпечує багате звучання, яке посилює занурення, забезпечуючи чисті високі та середні частоти, а також глибокі, різкі баси.\n" +
                "\n" +
                "Завдяки внутрішнім мікрофонам, призначеним для голосового зв'язку, Opus X гарантує, що ви завжди чуєте всіх учасників конференц-зв'язку, а вони чують вас з ідеальною чіткістю.\n" +
                "\n" +
                "Щоб бути в курсі свого оточення, активуйте режим швидкої уваги, щоб миттєво підсилити довколишній шум — корисно під час переходу через дорогу або просто для контролю ситуації довкола вас.");
        imgUrl = "https://content.rozetka.com.ua/goods/images/big/228389498.jpg";
        imgUrl += ",https://content1.rozetka.com.ua/goods/images/big/228389499.jpg";
        imgUrl += ",https://content2.rozetka.com.ua/goods/images/big/228389500.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/228389501.jpg";
        imgUrl += ",https://content.rozetka.com.ua/goods/images/big/228389505.jpg";
        product.setImageUrls(imgUrl);
        productsReference[15] = product;
        product = new Product();

        return productsReference;
    }

}
