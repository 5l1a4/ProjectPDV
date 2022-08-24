--  
--  Click nfs://nhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
--  Click nfs://nhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
-- 
--  Author:  Micholini
--  Created: 22/07/2022


INSERT INTO `pdv_project`.`productos` (`act`, `cod_bar`, `descripcion`, `url_img`, `precio`, `stock`) VALUES (1, '1111111111111', 'Arroz Patito', 'https://www.196flavors.com/wp-content/uploads/2018/04/arroz-de-pato-1-FP.jpg', '110', '5');
INSERT INTO `pdv_project`.`productos` (`act`, `cod_bar`, `descripcion`, `url_img`, `precio`, `stock`) VALUES (1, '2222222222222', 'Yerba', 'https://d3ugyf2ht6aenh.cloudfront.net/stores/001/176/840/products/ym-encuentro-tradicional-500gr-001-2d510d4aa697b5332016005181629090-640-0.jpg', '550', '11');
INSERT INTO `pdv_project`.`productos` (`act`, `cod_bar`, `descripcion`, `url_img`, `precio`, `stock`) VALUES (1, '3333333333333', 'Cerveza Patagonia', 'https://danor.com.ar/wp-content/uploads/35550.jpg', '440', '5');
INSERT INTO `pdv_project`.`productos` (`act`, `cod_bar`, `descripcion`, `url_img`, `precio`, `stock`) VALUES (1, '4444444444444', 'Mani', 'https://www.cucinare.tv/wp-content/uploads/2020/02/man%C3%AD.jpg', '180', '25');
INSERT INTO `pdv_project`.`productos` (`act`, `cod_bar`, `descripcion`, `url_img`, `precio`, `stock`) VALUES (1, '5555555555555', 'Papasfrias', 'https://s1.eestatic.com/2015/03/10/cocinillas/cocinillas_17008413_127305534_854x640.jpg', '330', '12');
INSERT INTO `pdv_project`.`productos` (`act`, `cod_bar`, `descripcion`, `url_img`, `precio`, `stock`) VALUES (1, '6666666666666', 'Hamurguesas Paladini', 'https://carrefourar.vtexassets.com/arquivos/ids/176776/7790079019616_02.jpg?v=637468574319630000', '220', '50');

-- Clientes
INSERT INTO `pdv_project`.`clientes` (`act`, `apellido`, `domicilio`, `email`, `nombre`, `nota`, `dni`, `telefono`) VALUES (1, 'Augusto', 'belgrano 1233', 'asdfsfdsd@yahoo.com', 'Mateos', 'falta a clases', '32.323.123', '(323)-4241-421');
INSERT INTO `pdv_project`.`clientes` (`act`, `apellido`, `domicilio`, `email`, `nombre`, `nota`, `dni`, `telefono`) VALUES (1, 'Sosa', 'jujuy5542', 'sosita@gmail.com', 'Alexander', 'jeje', '43.512.312', '(362)-4234-123');
INSERT INTO `pdv_project`.`clientes` (`act`, `apellido`, `domicilio`, `email`, `nombre`, `nota`, `dni`, `telefono`) VALUES (1, 'Da Rosa', 'milei 776', 'anderdaross@gmail.com', 'Anderson', 'caraho', '31.376.123', '(362)-4444-129');
INSERT INTO `pdv_project`.`clientes` (`act`, `apellido`, `domicilio`, `email`, `nombre`, `nota`, `dni`, `telefono`) VALUES (1, 'Falcon', 'mapuche 333', 'lautifer@gmail.com', 'lautaro', 'añamemuy', '43.734.552', '(362)-7351-933');
