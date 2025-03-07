[#ftl]
[@l.page title=" - turnaj"]
    <h1>Vítej v turnaji!</h1>
    [#if tournament??]
        <div class="tournament-info">
            <div><strong>Název turnaje:</strong> <span>${tournament.tournamentName}</span></div>
            <div><strong>Pořadatel:</strong> <span>${tournament.tournamentOrganizer}</span></div>
            <div><strong>Typ turnaje:</strong> <span>${tournament.tournamentType}</span></div>
            <div><strong>Počet kol:</strong> <span>${tournament.tournamentRounds}</span></div>
            <div><strong>Datum:</strong> <span>${tournament.tournamentDate}</span></div>
        </div>
        <div class="tournament-buttons">
            <a href="/editTournament">
                <button class="button" type="button">Upravit turnaj</button>
            </a>
            <a href="/playersList">
                <button class="button" type="button">Spravovat hráče</button>
            </a>
        </div>
    [#else]
        <form class="form" method="post" action="/">
            <div class="form__inputBox">
                <label class="form__label" for="tournamentName">Název turnaje *</label>
                <input type="text" name="tournamentName" required>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="tournamentOrganizer">Pořadatel *</label>
                <input type="text" name="tournamentOrganizer" required>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="tournamentDate">Datum turnaje</label>
                <input type="date" name="tournamentDate" required>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="tournamentType">Typ turnaje *</label>
                <select class="form__select" name="tournamentType" required>
                    <option value="pokemon">Pokémon</option>
                </select>
            </div>
            <div class="form__inputBox">
                <label class="form__label" for="tournamentRounds">Počet kol *</label>
                <input type="number" min="1" max="10" name="tournamentRounds" required>
            </div>
            <div class="button-container">
                <button class="button" type="submit">Založit turnaj</button>
            </div>
        </form>
    [/#if]
[/@l.page]