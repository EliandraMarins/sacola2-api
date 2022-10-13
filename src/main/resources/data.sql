INSERT INTO restaurante (id, cep, complemento, nome) VALUES
(1L, '96745-000', 'Rua Brasil', 'Restaurante 1'),
(2L, '95352-000', 'Rua Bahia', 'Restaurante 2');

INSERT INTO cliente (id, cep, complemento, nome) VALUES
(1L, '0000001', 'Avenida Silva e Souza', 'Eliandra');

INSERT INTO produto (id, disponivel, nome, valor_unitario, restaurante_id) VALUES
(1L, true, 'Bolo de banana', 12.0, 1L),
(2L, true, 'Espaguete', 18.0, 1L),
(3L, true, 'Arroz carreteiro', 15.30, 2L);

INSERT INTO sacola (id, forma_pagamento, fechada, valor_total, cliente_id) VALUES
(1L, 0, false, 0.0, 1L);