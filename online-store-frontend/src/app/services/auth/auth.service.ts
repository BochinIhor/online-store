import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {forkJoin, Observable} from "rxjs";
import {User} from "../../entity/user";

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  checkUser!: User;

  private serviceUrl: string = "http://localhost:8080/api/store/users";

  constructor(private _httpClient: HttpClient) {
  }

  getAll(): Observable<User[]> {
    return this._httpClient.get<User[]>(this.serviceUrl);
  }

  getUserByName(username: any): Observable<User> {
    return this._httpClient.get<User>(`${this.serviceUrl}/${username}`);
  }

  canRegister(user: User): boolean {
    this.getUserByName(user.username).subscribe(res => {
      this.checkUser = res;
    });
    return this.checkUser == null;
  }

  proceedRegistration(newUser: User): Observable<User> {
    newUser.role = "user";
    return this._httpClient.post<User>(this.serviceUrl, newUser);
  }

  isLoggedIn() {
    return sessionStorage.getItem('username') != null;
  }

  getUserRole() {
    return sessionStorage.getItem('role') != null ? sessionStorage.getItem('role')?.toString() : '';
  }
}
