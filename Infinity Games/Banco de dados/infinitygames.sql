-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 04-Nov-2022 às 13:20
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `infinitygames`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `jogos`
--

CREATE TABLE `jogos` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `descri` varchar(2000) NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `jogos`
--

INSERT INTO `jogos` (`id`, `nome`, `descri`, `valor`) VALUES
(1, 'Terraria', 'Cave, lute, explore, construa! Nada é impossível nesse jogo de aventura cheio de ação. O mundo é a sua tela de pintar e o chão em si é a sua tinta.\r\nPegue suas ferramentas e vá! Faça novas armas para lutar contra uma variedades de inimigos em numerosos biomas. Cave profundamente no subsolo para encontrar acessórios, dinheiro e outras coisas úteis. Reúna recursos para criar tudo o que você precisa para tornar o mundo o seu próprio. Construa uma casa, um forte ou até mesmo um castelo. Pessoas vão ', 20),
(2, 'Hollow Knight', 'Enfrente as profundezas de um reino esquecido\r\nAbaixo da cidade moribunda de Dirtmouth jaz um reino antigo e arruinado. Muitos são atraídos para o subterrâneo em busca de riquezas, glórias ou respostas para antigos segredos.\r\n\r\nHollow Knight é uma aventura de ação clássica em estilo 2D por um vasto mundo interligado. Explore cavernas serpenteantes, cidades antigas e ermos mortais; lute contra criaturas malignas e alie-se a insetos bizarros, e solucione mistérios antigos no centro do reino.', 28),
(3, 'OneShot', 'Um jogo de aventura e quebra-cabeça surreal com recursos e mecânicas exclusivos.\r\nVocê deverá guiar uma criança por um mundo misterioso e restaurar o seu sol há muito extinto.\r\n... É claro, as coisas nunca são tão simples.\r\nO mundo sabe que você existe.\r\nAs consequências são reais.\r\nSalvar o mundo pode ser impossível.\r\nVocê só tem uma chance.', 20),
(4, 'Horizon Chase Turbo', 'Horizon Chase Turbo é um jogo de corrida inspirado nos grandes sucessos dos anos 80 e 90: Out Run, Lotus Turbo Challenge, Top Gear (SNES), Rush, entre outros. Cada curva e cada volta no Horizon Chase Turbo recria a jogabilidade de arcade clássica e oferece velocidade e diversão ilimitadas. Pise fundo e divirta-se!', 50),
(5, 'Punch Club', 'Seu pai foi assassinado brutalmente diante dos seus olhos. Agora você deve treinar com tudo, comer frango, dar um cacete numa galera pra conquistar seu lugar na classificação do Punch Club e descobrir quem matou seu pai.\r\n\r\nPunch Club é um sistema de gestão de carreira de boxe com múltiplas possibilidades de enredo. Seu objetivo é claro, mas como você chega lá depende de você. Seja trilhando o caminho do bom moço, dentro da lei, ou pegando a duvidosa estrada sombria.\r\nDurante seu caminho, vai ser uma boa você se concentrar nos seus talentos. Será que você vai seguir o Estilo do Tigre, o Estilo da Tartaruga ou o Estilo do Urso? Força, precisão ou agilidade. Listras, casco ou garras? Tudo depende do estilo que guiar o seu caminho.\r\n\r\nE cada decisão vai ter um peso, principalmente na sua vida social. Viva num malabarismo constante de vida amorosa, trabalho, tempo de lazer, relacionamentos e, se bobear, até o estrelato. Tudo junto e misturado, enquanto você treina na academia e luta contra jacarés. Puxar ferro não é tudo na vida, viu?', 20),
(6, 'Hades', 'Hades é um jogo roguelike que combina os melhores aspectos dos títulos da Supergiant aclamados pela crítica, incluindo a ação rápida de Bastion, a rica atmosfera e profundidade de Transistor e a narrativa baseada em personagens de Pyre.\r\n\r\nLUTE PARA SAIR DO INFERNO\r\nNa pele do imortal Príncipe do Submundo, você usará os poderes e as armas míticas do Olimpo para se libertar das garras do deus dos mortos, enquanto se fortalece e descobre mais sobre a história a cada tentativa única de fuga.\r\n\r\nLIBERE A FÚRIA DO OLIMPO\r\nOs deuses do Olimpo vão te ajudar! Conheça Zeus, Atena, Poseidon e muitos outros, e escolha entre dezenas de Dádivas poderosas que aprimoram suas habilidades. Existem milhares de construções possíveis de personagens para descobrir à medida que avança.', 48),
(7, 'Stardew Valley', 'Você herdou a antiga fazenda do seu avô, em Stardew Valley. Com ferramentas de segunda-mão e algumas moedas, você parte para dar início a sua nova vida. Será que você vai aprender a viver da terra, a transformar esse matagal em um próspero lar?', 25),
(8, 'Moonlighter', 'Desde o lançamento, adicionamos muito conteúdo novo ao Moonlighter por meio de atualizações. De mudanças pequenas, como a possibilidade de mudar a função das teclas, correções de erros e ajustes de balanceamento, a grandes inovações que prometemos em nosso planejamento. A versão atual de Moonlighter oferece a experiência original com uma fama de melhorias importantes para novos e antigos jogadores.\r\n\r\nEncare minichefes usando armas, armaduras, anéis e amuletos inéditos. Navegue por 100 padrões novos para as salas com a ajuda de 9 companheiros corajosos e descubra mais sobre a história. Termine a aventura principal e desbloqueie o modo Novo Jogo+, que contém desafios e opções adicionais.', 10),
(9, 'Ori and the Blind Forest', 'A floresta de Nibel está morrendo. Após uma poderosa tempestade que iniciou uma série de eventos devastadores, um improvável herói deve fazer uma jornada para encontrar a sua coragem e confrontar um inimigo sombrio para salvar o seu lar. \"Ori and the Blind Forest\" conta a história de um jovem órfão destinado a feitos heróicos através de um jogo de ação e plataforma com um visual impressionante, criado pela Moon Studios para PC. Contando com um trabalho artístico pintado à mão, atuação de personagens meticulosamente animada e uma trilha sonora inteiramente orquestrada, \"Ori and the Blind Forest\" explora uma história profundamente emocional sobre amor e sacrifício, além da esperança que existe em todos nós.', 60),
(10, 'Child of Light', 'Aurora, uma jovem da Áustria de 1895, desperta no continente perdido de conto de fadas da Lemúria. Para voltar para casa, ela deve lutar contra as criaturas sombrias da Rainha da Noite, que roubaram o sol, a lua e as estrelas. Em jogo não está apenas a Lemúria, mas o verdadeiro destino de Aurora.\r\n\r\nUMA AVENTURA A SUA ESPERA!\r\nCriado por uma talentosa equipe da Ubisoft Montreal usando o UbiArt Framework, Child of Light é um RPG inspirado em contos de fadas complementado com uma história cuidadosamente elaborada em versos e rimas. Entre em uma pintura viva, o cenário de tirar o fôlego da Lemúria é um convite para explorar um mundo perdido há muito tempo.\r\n\r\nENTRE NO MUNDO DE LEMÚRIA!\r\nAo longo de sua jornada pela Lemúria, você encontrará muitas criaturas excêntricas, de espíritos da floresta a ratos falantes, bruxas malvadas e serpentes marinhas malignas. Descubra uma vasta terra com locais icônicos e masmorras emocionantes que evoluirão à medida que Aurora recupera as luzes roubadas.', 45);

-- --------------------------------------------------------

--
-- Estrutura da tabela `registro`
--

CREATE TABLE `registro` (
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `seg` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(100) NOT NULL,
  `seg` varchar(100) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `jogos`
--
ALTER TABLE `jogos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nome` (`nome`);

--
-- Índices para tabela `registro`
--
ALTER TABLE `registro`
  ADD UNIQUE KEY `email` (`email`);

--
-- Índices para tabela `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `jogos`
--
ALTER TABLE `jogos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
